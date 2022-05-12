package migration;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

import java.sql.Statement;

public class V1__Generate_Scheme extends BaseJavaMigration {

    private static final String CREATE_ID_SEQUENCE = "CREATE SEQUENCE hibernate_sequence AS bigint START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999 CACHE";
    private static final String CREATE_PERSON_TABLE = "CREATE TABLE person ( id bigint PRIMARY KEY, firstName varchar(255) NOT NULL, lastName varchar(255) NOT NULL)";

    @Override
    public void migrate(Context context) throws Exception {
        try (Statement select = context.getConnection().createStatement()) {
            select.executeQuery(CREATE_ID_SEQUENCE);
            select.executeQuery(CREATE_PERSON_TABLE);
        }
    }
}
