<?xml version="1.0" encoding="UTF-8"?><Root>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_Configurations" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_Utils" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_Staging" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
    <Component name="SS_Shared_Staging.jdbcConnection.stagingConnection" type="artconnection">
      <Property propertyName="art.deployment.state" propertyValue="enable"/>
      <Property propertyName="transactionType" propertyValue="NO_TRANSACTION"/>
      <Property propertyName="driverType" propertyValue="Default"/>
      <Property propertyName="datasourceClass" propertyValue="oracle.jdbc.pool.OracleDataSource"/>
      <Property propertyName="serverName" propertyValue="localhost"/>
      <Property propertyName="user" propertyValue="SSAPP"/>
      <Property propertyName="password" propertyValue="SSAPP"/>
      <Property propertyName="databaseName" propertyValue=""/>
      <Property propertyName="portNumber" propertyValue="1521"/>
      <Property propertyName="networkProtocol" propertyValue="tcp"/>
      <Property propertyName="otherProperties" propertyValue="driverType=thin;serviceName=ORCLPDB"/>
      <Property propertyName=".CMGRPROP.poolable" propertyValue="true"/>
      <Property propertyName=".CMGRPROP.minimumPoolSize" propertyValue="1"/>
      <Property propertyName=".CMGRPROP.maximumPoolSize" propertyValue="10"/>
      <Property propertyName=".CMGRPROP.poolIncrementSize" propertyValue="1"/>
      <Property propertyName=".CMGRPROP.blockingTimeout" propertyValue="1000"/>
      <Property propertyName=".CMGRPROP.expireTimeout" propertyValue="1000"/>
      <Property propertyName=".CMGRPROP.startupRetryCount" propertyValue="0"/>
      <Property propertyName=".CMGRPROP.startupBackoffSecs" propertyValue="10"/>
      <Property propertyName=".CMGRPROP.heartBeatInterval" propertyValue="0"/>
    </Component>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_RequestHandlers" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_Processes_Services" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_Processes_Batch" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
    <Component name="SS_Shared_Processes_Batch.jdbcConnection.batchConnection" type="artconnection">
      <Property propertyName="art.deployment.state" propertyValue="enable"/>
      <Property propertyName="transactionType" propertyValue="NO_TRANSACTION"/>
      <Property propertyName="driverType" propertyValue="Default"/>
      <Property propertyName="datasourceClass" propertyValue="oracle.jdbc.pool.OracleDataSource"/>
      <Property propertyName="serverName" propertyValue="localhost"/>
      <Property propertyName="user" propertyValue="SSAPP"/>
      <Property propertyName="password" propertyValue="SSAPP"/>
      <Property propertyName="databaseName" propertyValue=""/>
      <Property propertyName="portNumber" propertyValue="1521"/>
      <Property propertyName="networkProtocol" propertyValue="tcp"/>
      <Property propertyName="otherProperties" propertyValue="driverType=thin;serviceName=ORCLPDB"/>
      <Property propertyName=".CMGRPROP.poolable" propertyValue="true"/>
      <Property propertyName=".CMGRPROP.minimumPoolSize" propertyValue="1"/>
      <Property propertyName=".CMGRPROP.maximumPoolSize" propertyValue="10"/>
      <Property propertyName=".CMGRPROP.poolIncrementSize" propertyValue="1"/>
      <Property propertyName=".CMGRPROP.blockingTimeout" propertyValue="1000"/>
      <Property propertyName=".CMGRPROP.expireTimeout" propertyValue="1000"/>
      <Property propertyName=".CMGRPROP.startupRetryCount" propertyValue="0"/>
      <Property propertyName=".CMGRPROP.startupBackoffSecs" propertyValue="10"/>
      <Property propertyName=".CMGRPROP.heartBeatInterval" propertyValue="0"/>
    </Component>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_Process_Resubmits" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_Process_Logging" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
    <Component name="SS_Shared_Process_Logging.jdbcConnection.loggingConnection" type="artconnection">
      <Property propertyName="art.deployment.state" propertyValue="enable"/>
      <Property propertyName="transactionType" propertyValue="NO_TRANSACTION"/>
      <Property propertyName="driverType" propertyValue="Default"/>
      <Property propertyName="datasourceClass" propertyValue="oracle.jdbc.pool.OracleDataSource"/>
      <Property propertyName="serverName" propertyValue="localhost"/>
      <Property propertyName="user" propertyValue="SSAPP"/>
      <Property propertyName="password" propertyValue="SSAPP"/>
      <Property propertyName="databaseName" propertyValue=""/>
      <Property propertyName="portNumber" propertyValue="1521"/>
      <Property propertyName="networkProtocol" propertyValue="tcp"/>
      <Property propertyName="otherProperties" propertyValue="driverType=thin;serviceName=ORCLPDB"/>
      <Property propertyName=".CMGRPROP.poolable" propertyValue="true"/>
      <Property propertyName=".CMGRPROP.minimumPoolSize" propertyValue="1"/>
      <Property propertyName=".CMGRPROP.maximumPoolSize" propertyValue="10"/>
      <Property propertyName=".CMGRPROP.poolIncrementSize" propertyValue="1"/>
      <Property propertyName=".CMGRPROP.blockingTimeout" propertyValue="1000"/>
      <Property propertyName=".CMGRPROP.expireTimeout" propertyValue="1000"/>
      <Property propertyName=".CMGRPROP.startupRetryCount" propertyValue="0"/>
      <Property propertyName=".CMGRPROP.startupBackoffSecs" propertyValue="10"/>
      <Property propertyName=".CMGRPROP.heartBeatInterval" propertyValue="0"/>
    </Component>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_Logging" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_CoreProcess_WF" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_CoreProcess_Services" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_CoreProcess_Batch" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
    <Component name="SS_Shared_CoreProcess_Batch.jdbcConnection.batchConnection" type="artconnection">
      <Property propertyName="art.deployment.state" propertyValue="enable"/>
      <Property propertyName="transactionType" propertyValue="NO_TRANSACTION"/>
      <Property propertyName="driverType" propertyValue="Default"/>
      <Property propertyName="datasourceClass" propertyValue="oracle.jdbc.pool.OracleDataSource"/>
      <Property propertyName="serverName" propertyValue="localhost"/>
      <Property propertyName="user" propertyValue="SSAPP"/>
      <Property propertyName="password" propertyValue="SSAPP"/>
      <Property propertyName="databaseName" propertyValue=""/>
      <Property propertyName="portNumber" propertyValue="1521"/>
      <Property propertyName="networkProtocol" propertyValue="tcp"/>
      <Property propertyName="otherProperties" propertyValue="driverType=thin;serviceName=ORCLPDB"/>
      <Property propertyName=".CMGRPROP.poolable" propertyValue="true"/>
      <Property propertyName=".CMGRPROP.minimumPoolSize" propertyValue="1"/>
      <Property propertyName=".CMGRPROP.maximumPoolSize" propertyValue="10"/>
      <Property propertyName=".CMGRPROP.poolIncrementSize" propertyValue="1"/>
      <Property propertyName=".CMGRPROP.blockingTimeout" propertyValue="1000"/>
      <Property propertyName=".CMGRPROP.expireTimeout" propertyValue="1000"/>
      <Property propertyName=".CMGRPROP.startupRetryCount" propertyValue="0"/>
      <Property propertyName=".CMGRPROP.startupBackoffSecs" propertyValue="10"/>
      <Property propertyName=".CMGRPROP.heartBeatInterval" propertyValue="0"/>
    </Component>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_AdminConfigurations" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
    <Component name="SS_Shared_AdminConfigurations.jdbcConnection.configTransactionalConnection" type="artconnection">
      <Property propertyName="art.deployment.state" propertyValue="enable"/>
      <Property propertyName="transactionType" propertyValue="LOCAL_TRANSACTION"/>
      <Property propertyName="driverType" propertyValue="Default"/>
      <Property propertyName="datasourceClass" propertyValue="oracle.jdbc.pool.OracleDataSource"/>
      <Property propertyName="serverName" propertyValue="localhost"/>
      <Property propertyName="user" propertyValue="SSAPP"/>
      <Property propertyName="password" propertyValue="SSAPP"/>
      <Property propertyName="databaseName" propertyValue=""/>
      <Property propertyName="portNumber" propertyValue="1521"/>
      <Property propertyName="networkProtocol" propertyValue="tcp"/>
      <Property propertyName="otherProperties" propertyValue="driverType=thin;serviceName=ORCLPDB"/>
      <Property propertyName=".CMGRPROP.poolable" propertyValue="true"/>
      <Property propertyName=".CMGRPROP.minimumPoolSize" propertyValue="1"/>
      <Property propertyName=".CMGRPROP.maximumPoolSize" propertyValue="10"/>
      <Property propertyName=".CMGRPROP.poolIncrementSize" propertyValue="1"/>
      <Property propertyName=".CMGRPROP.blockingTimeout" propertyValue="1000"/>
      <Property propertyName=".CMGRPROP.expireTimeout" propertyValue="1000"/>
      <Property propertyName=".CMGRPROP.startupRetryCount" propertyValue="0"/>
      <Property propertyName=".CMGRPROP.startupBackoffSecs" propertyValue="10"/>
      <Property propertyName=".CMGRPROP.heartBeatInterval" propertyValue="0"/>
    </Component>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_Adapter_RequestMS" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_Adapter_NotificationMS" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_Adapter_MS" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_Adapter_Kafka" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
    <Component name="SS_Shared_Adapter_Kafka.listener.bpmRequestListener" type="artlistener">
      <Property propertyName="connDataNodeName" propertyValue="SS_Shared_KAFKAConnections.Connection:KAFKAConsumedConnection"/>
      <Property propertyName="pollInterval" propertyValue="1000"/>
      <Property propertyName="seekOffsets" propertyValue=""/>
      <Property propertyName="partitions" propertyValue=""/>
      <Property propertyName="topicName" propertyValue="ss-bpmRequest"/>
      <Property propertyName="art.deployment.state" propertyValue="disable"/>
      <Property propertyName="retryLimit" propertyValue="5"/>
      <Property propertyName="retryBackoffTimeout" propertyValue="10"/>
    </Component>
    <Component name="SS_Shared_Adapter_Kafka.notification.bpmRequestNotification" type="artlistenernotification">
      <Property propertyName="art.deployment.state" propertyValue="enable"/>
    </Component>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_Adapter_EmployeeProfile" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_Adapter_DataPower" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_Shared_Adapter_ConfigMS" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_SafetyAndSecurity_WFRules" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_SafetyAndSecurity_VHR_WF" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_SafetyAndSecurity_VHR_Services" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_SafetyAndSecurity_Adapter_SecurityMS" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_SafetyAndSecurity_Adapter_SIPort" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  <DeploymentSet allowEmptyValues="true" assetCompositeName="SS_APIsCatalog" deploymentSetName="myDeploymentSet" serverAliasName="IS_PickRepo" targetServerName="testServer" targetServerType="IS">
    <Property propertyName="activatePkgOnInstall" propertyValue="true"/>
    <Property propertyName="archivePkgOnInstall" propertyValue="true"/>
    <Property propertyName="compilePackage" propertyValue="true"/>
    <Property propertyName="fragPackage" propertyValue="true"/>
    <Property propertyName="clearACLs" propertyValue="false"/>
    <Property propertyName="disallowActivePackageInstall" propertyValue="false"/>
    <Property propertyName="packageExecutionCheck" propertyValue="0"/>
    <Property propertyName="suspendTriggersDuringDeploy" propertyValue="false"/>
    <Property propertyName="syncDocTypesToBroker" propertyValue="false"/>
    <Property propertyName="restartRuntimes" propertyValue="false"/>
  </DeploymentSet>
  
</Root>