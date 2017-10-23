FROM postgres
MAINTAINER Pedro Arthur <pfernandesvasconcelos@gmail.com>
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD 12345
ENV POSTGRES_DB dac-contacts
COPY tables.sql /docker-entrypoint-initdb.d/