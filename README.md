# flyway-demo

### Start demo database
1.) docker image pull postgres/latest

2.) docker run --name demoDB -p 5432:5432 -e POSTGRES_USER=demo -e POSTGRES_PASSWORD=demo -e POSTGRES_DB=demoDB -d postgres


SAMPLE CONFIGURATION
> 
    <configuration>
        <driver>org.hsqldb.jdbcDriver</driver>
        <url>jdbc:hsqldb:file:${project.build.directory}/db/flyway_sample;shutdown=true</url>
        <user>SA</user>
        <password>mySecretPwd</password>
        <connectRetries>10</connectRetries>
        <initSql>SET ROLE 'myuser'</initSql>
        <schemas>
            <schema>schema1</schema>
            <schema>schema2</schema>
            <schema>schema3</schema>
        </schemas>
        <createSchemas>true</createSchemas>
        <table>schema_history</table>
        <tablespace>my_tablespace</tablespace>
        <locations>
            <location>classpath:migrations1</location>
            <location>migrations2</location>
            <location>filesystem:/sql-migrations</location>
            <location>s3:migrationsBucket</location>
            <location>gcs:migrationsBucket</location>
        </locations>
        <sqlMigrationPrefix>Migration-</sqlMigrationPrefix>
        <undoSqlMigrationPrefix>downgrade</undoSqlMigrationPrefix>
        <repeatableSqlMigrationPrefix>RRR</repeatableSqlMigrationPrefix>
        <sqlMigrationSeparator>__</sqlMigrationSeparator>
        <sqlMigrationSuffixes>
            <sqlMigrationSuffix>.sql</sqlMigrationSuffix>
            <sqlMigrationSuffix>.pkg</sqlMigrationSuffix>
            <sqlMigrationSuffix>.pkb</sqlMigrationSuffix>
        </sqlMigrationSuffixes>
        <stream>true</stream>
        <batch>true</batch>
        <encoding>ISO-8859-1</encoding>
        <placeholderReplacement>true</placeholderReplacement>
        <placeholders>
            <aplaceholder>value</aplaceholder>
            <otherplaceholder>value123</otherplaceholder>
        </placeholders>
        <placeholderPrefix>#[</placeholderPrefix>
        <placeholderSuffix>]</placeholderSuffix>
        <resolvers>
            <resolver>com.mycompany.project.CustomResolver</resolver>
            <resolver>com.mycompany.project.AnotherResolver</resolver>
        </resolvers>
        <skipDefaultResolvers>false</skipDefaultResolvers>
        <callbacks>
            <callback>com.mycompany.project.CustomCallback</callback>
            <callback>com.mycompany.project.AnotherCallback</callback>
        </callbacks>
        <skipDefaultCallbacks>false</skipDefaultCallbacks>
        <target>1.1</target>
        <outOfOrder>false</outOfOrder>
        <outputQueryResults>false</outputQueryResults>
        <validateOnMigrate>true</validateOnMigrate>
        <cleanOnValidationError>false</cleanOnValidationError>
        <mixed>false</mixed>
        <group>false</group>
        <ignoreMissingMigrations>false</ignoreMissingMigrations>
        <ignoreIgnoredMigrations>false</ignoreIgnoredMigrations>
        <ignoreFutureMigrations>false</ignoreFutureMigrations>
        <cleanDisabled>false</cleanDisabled>
        <baselineOnMigrate>false</baselineOnMigrate>
        <baselineVersion>5</baselineVersion>
        <baselineDescription>Let's go!</baselineDescription>
        <installedBy>my-user</installedBy>
        <skip>false</skip>
        <configFiles>
            <configFile>myConfig.conf</configFile>
            <configFile>other.conf</configFile>
        </configFiles>
        <workingDirectory>/my/working/dir</workingDirectory>
        <errorOverrides>
            <errorOverride>99999:17110:E</errorOverride>
            <errorOverride>42001:42001:W</errorOverride>
        </errorOverrides>
        <dryRunOutput>/my/sql/dryrun-outputfile.sql</dryRunOutput>
        <lockRetryCount>10</lockRetryCount>
        <oracle.sqlplus>true</oracle.sqlplus>
        <oracle.sqlplusWarn>true</oracle.sqlplusWarn>
        <jdbcProperties>
          <myProperty>myValue</myProperty>
          <myOtherProperty>myOtherValue</myOtherProperty>
        </jdbcProperties>
    </configuration>



