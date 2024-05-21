<?xml version="1.0" encoding="UTF-8"?><DeploymentSets>
  <DeploymentSet name="myDeploymentSet" pluginGroup="false" pluginType="IS" sourceAlias="local" targetAlias="testServer">
    <VarSubAssets>
      <VarSubAsset assetName="SS_Shared_CoreProcess_Services.jdbcConnection:coreProcessConnection" assetType="AdapterConnection">
        <attributeList>
          <attributes name="connectionManagerProperties">
            <attribute name="poolable" value="true"/>
            <attribute name="minimumPoolSize" value="1"/>
            <attribute name="maximumPoolSize" value="10"/>
            <attribute name="poolIncrementSize" value="1"/>
            <attribute name="blockingTimeout" value="1000"/>
            <attribute name="expireTimeout" value="1000"/>
            <attribute name="startupRetryCount" value="0"/>
            <attribute name="startupBackoffSecs" value="10"/>
            <attribute name="heartBeatInterval" value="0"/>
          </attributes>
          <attributes name="parameters">
            <attribute name="transactionType" value="NO_TRANSACTION"/>
            <attribute name="driverType" value="Default"/>
            <attribute name="datasourceClass" value="oracle.jdbc.pool.OracleDataSource"/>
            <attribute name="serverName" value="10.111.11.251"/>
            <attribute name="user" value="SSAPP"/>
            <attribute name="password" value="{AES}Cc3uNPy7qFUL6tCtYK/AlQ=="/>
            <attribute name="databaseName" value="wmss"/>
            <attribute name="portNumber" value="1521"/>
            <attribute name="networkProtocol" value="tcp"/>
            <attribute name="otherProperties" value="driverType=thin"/>
          </attributes>
        </attributeList>
      </VarSubAsset>
    </VarSubAssets>
  </DeploymentSet>
  <DeploymentSet name="myDeploymentSet" pluginGroup="false" pluginType="IS" sourceAlias="local" targetAlias="testServer">
    <VarSubAssets>
      <VarSubAsset assetName="SS_Shared_Staging.jdbcConnection:stagingConnection" assetType="AdapterConnection">
        <attributeList>
          <attributes name="connectionManagerProperties">
            <attribute name="poolable" value=""/>
            <attribute name="minimumPoolSize" value=""/>
            <attribute name="maximumPoolSize" value=""/>
            <attribute name="poolIncrementSize" value=""/>
            <attribute name="blockingTimeout" value=""/>
            <attribute name="expireTimeout" value=""/>
            <attribute name="startupRetryCount" value=""/>
            <attribute name="startupBackoffSecs" value=""/>
            <attribute name="heartBeatInterval" value=""/>
          </attributes>
          <attributes name="parameters">
            <attribute name="transactionType" value=""/>
            <attribute name="driverType" value=""/>
            <attribute name="datasourceClass" value=""/>
            <attribute name="serverName" value=""/>
            <attribute name="user" value=""/>
            <attribute name="password" value=""/>
            <attribute name="databaseName" value=""/>
            <attribute name="portNumber" value=""/>
            <attribute name="networkProtocol" value=""/>
            <attribute name="otherProperties" value=""/>
          </attributes>
        </attributeList>
      </VarSubAsset>
    </VarSubAssets>
  </DeploymentSet>
  <DeploymentSet name="myDeploymentSet" pluginGroup="false" pluginType="IS" sourceAlias="local" targetAlias="testServer">
    <VarSubAssets>
      <VarSubAsset assetName="SS_Shared_CoreProcess_Services.taskServices:slaHandler_WSD" assetType="webServiceDescriptor">
        <attributeList>
          <attribute name="handlerData$$$securityHandlerName" value=""/>
          <attribute name="handlerData$$$policyName" value=""/>
          <attribute name="handlerData$$$effectivePolicyName" value=""/>
          <attribute name="binderData$$$portAlias" value=""/>
          <attribute name="binderData$$$transportType" value=""/>
          <attribute name="binderData$$$bindingName" value=""/>
          <attribute name="binderData$$$portTypeName" value=""/>
          <attribute name="binderData$$$soapProtocol" value=""/>
          <attribute name="binderData$$$bindingStyle" value=""/>
          <attribute name="binderData$$$bindingUse" value=""/>
        </attributeList>
      </VarSubAsset>
    </VarSubAssets>
  </DeploymentSet>
</DeploymentSets>
