# flyway-demo

### Start demo database
1.) docker image pull postgres/latest

2.) docker run --name demoDB -p 5432:5432 -e POSTGRES_USER=demo -e POSTGRES_PASSWORD=demo -e POSTGRES_DB=demoDB -d postgres

