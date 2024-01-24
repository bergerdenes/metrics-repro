Open a terminal window and run ./gradlew bootRun
Open a second terminal window and execute the following:

$ curl localhost:8080/test # (maybe repeat it a few times)
$ curl localhost:8080/metrics | grep ^http_server_requests

You will see "UNKNOWN" in the uri field.

(in our real world project, apart from /info, /health, /metrics endpoint statistics, we see "UNKNOWN" in EVERY mertric!)
