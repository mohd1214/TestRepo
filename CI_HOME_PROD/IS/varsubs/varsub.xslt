<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">  
  <xsl:output method="xml" encoding="utf-8" indent="yes"/>
  <xsl:param name="isPackagesString"/>
  <xsl:template match="/">
    <Root>
      <!-- Iterate over all DeploymentSet elements -->
      <xsl:for-each select="Root/DeploymentSet">
        <!-- Filter for matching assetCompositeName attribute -->
        <xsl:if test="contains($isPackagesString, concat(',', @assetCompositeName, ','))">
          <!-- Output the current DeploymentSet element -->
          <xsl:copy-of select="."/>
        </xsl:if>
      </xsl:for-each>
    </Root>
  </xsl:template>
  
  <!-- Ignore all other elements -->
  <xsl:template match="node() | @*">
    <xsl:apply-templates select="node() | @*"/>
  </xsl:template>

</xsl:stylesheet>