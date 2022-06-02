load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary")

scala_binary(
    name = "hello",
    srcs = ["hello.scala"],
    main_class = "hello",
    jvm_flags = [
        # "-Dlogback.configurationFile=asana/server/src/main/resources/api-logback.xml",
        # "-Djavax.net.ssl.trustStore=lunadb/src/main/resources/asana-localhost-truststore.jks",
        # "-Djavax.net.ssl.trustStorePassword=changeit",
        # "-Dconfig.resource=com/asana/api/application.conf",
        "-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=localhost:5010", # uncomment me to enable intellij remote debugging
    ]
)