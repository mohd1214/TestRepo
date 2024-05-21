<!--
 Copyright © 2010 - 2013 Apama Ltd.
 Copyright © 2013 - 2018 Software AG, Darmstadt, Germany and/or its licensors

 SPDX-License-Identifier: Apache-2.0

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.                                                            
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	version="1.0">
	
	<xsl:output method="xml" encoding="utf-8" indent="yes"/>
	
	<xsl:param name="deployerHost"/>
	<xsl:param name="deployerPort"/>
	<xsl:param name="deployerUsername"/>
	<xsl:param name="deployerPassword"/>
	
	<xsl:param name="prodMWSHost1"/>
	<xsl:param name="prodMWSPort1"/>
	<xsl:param name="prodMWSUsername1"/>
	<xsl:param name="prodMWSPassword1"/>

	<xsl:param name="prodMWSHost2"/>
	<xsl:param name="prodMWSPort2"/>
	<xsl:param name="prodMWSUsername2"/>
	<xsl:param name="prodMWSPassword2"/>


	
	<xsl:param name="repoName"/>
	<xsl:param name="repoPath"/>
	<xsl:param name="projectName"/>
		
	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()" />
		</xsl:copy>
	</xsl:template>
	
	<xsl:template match="DeployerSpec/DeployerServer">
		<DeployerServer>
			<host><xsl:value-of select="$deployerHost"/>:<xsl:value-of select="$deployerPort"/></host>
			<user><xsl:value-of select="$deployerUsername"/></user>
			<pwd><xsl:value-of select="$deployerPassword"/></pwd>
		</DeployerServer>
	</xsl:template>

	<xsl:template match="DeployerSpec/Environment">
	    <Environment>
			<MWS>
				<mwsalias name="prodMWS1">
				<host><xsl:value-of select="$prodMWSHost1"/></host>
				<port><xsl:value-of select="$prodMWSPort1"/></port>
				<user><xsl:value-of select="$prodMWSUsername1"/></user>
				<pwd><xsl:value-of select="$prodMWSPassword1"/></pwd>
				<useSSL>false</useSSL>
				<excludeCoreTaskEngineDependencies>true</excludeCoreTaskEngineDependencies>
				<cacheTimeOut>900</cacheTimeOut>
				<includeSecurityDependencies>true</includeSecurityDependencies>
				<rootFolderAliases>folder.public</rootFolderAliases>
				<maximumFolderObjectCount>10000</maximumFolderObjectCount>
				<enableAddtionalLogging>false</enableAddtionalLogging>
				<maxFolderDepth>25</maxFolderDepth>
				<Test>true</Test>
				</mwsalias>
			</MWS>
			<MWS>
				<mwsalias name="prodMWS2">
				<host><xsl:value-of select="$prodMWSHost2"/></host>
				<port><xsl:value-of select="$prodMWSPort2"/></port>
				<user><xsl:value-of select="$prodMWSUsername2"/></user>
				<pwd><xsl:value-of select="$prodMWSPassword2"/></pwd>
				<useSSL>false</useSSL>
				<excludeCoreTaskEngineDependencies>true</excludeCoreTaskEngineDependencies>
				<cacheTimeOut>900</cacheTimeOut>
				<includeSecurityDependencies>true</includeSecurityDependencies>
				<rootFolderAliases>folder.public</rootFolderAliases>
				<maximumFolderObjectCount>10000</maximumFolderObjectCount>
				<enableAddtionalLogging>false</enableAddtionalLogging>
				<maxFolderDepth>25</maxFolderDepth>
				<Test>true</Test>
				</mwsalias>
			</MWS>
			<xsl:apply-templates select="@* | *" />
		</Environment>
	</xsl:template>

	
	<xsl:template match="DeployerSpec/Environment/Repository">
		<Repository>
			<xsl:apply-templates select="@* | *" />
			
			<repalias>
			<xsl:attribute name="name"><xsl:value-of select="$repoName"/></xsl:attribute>
				<type>FlatFile</type>
				<urlOrDirectory><xsl:value-of select="$repoPath"/></urlOrDirectory>
				<Test>true</Test>
			</repalias>
	
		</Repository>
	</xsl:template>
	
	
	<xsl:template match="DeployerSpec/Projects">
		<Projects>
			<xsl:apply-templates select="@* | *" />
			
			<Project description="" ignoreMissingDependencies="true" overwrite="true" type="Repository">
			<xsl:attribute name="name"><xsl:value-of select="$projectName"/></xsl:attribute>			

				<DeploymentSet autoResolve="full" description="" name="myDeploymentSet">
				<xsl:attribute name="srcAlias"><xsl:value-of select="$repoName"/></xsl:attribute>

					<Composite displayName="" name="*" type="*">
						<xsl:attribute name="srcAlias"><xsl:value-of select="$repoName"/></xsl:attribute>
                                        </Composite> 
				</DeploymentSet>
				
				<DeploymentMap description="" name="myDeploymentMap"/>			
				<MapSetMapping mapName="myDeploymentMap" setName="myDeploymentSet">	
					<alias type="MWS">prodMWS1</alias>
					<alias type="MWS">prodMWS2</alias>
				</MapSetMapping>	
				<DeploymentCandidate description="" mapName="myDeploymentMap" name="myDeployment"/>
			</Project>

		</Projects>		
	</xsl:template>

</xsl:stylesheet>