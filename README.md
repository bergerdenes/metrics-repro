Open a terminal window and run `./gradlew bootRun`

Open a second terminal window and execute the following:

```
$ curl localhost:8080/metrics | grep ^http_server_requests
$ curl localhost:8080/jersey/test
$ curl localhost:8080/metrics | grep ^http_server_requests
```

You will see "UNKNOWN" in the uri field.


Now restart the application in the first terminal and then try again in the second terminal:

If you change the order (i.e. call a Jersey endpoint first), 

```
$ curl localhost:8080/jersey/test
$ curl localhost:8080/metrics | grep ^http_server_requests
```

then the metrics are good.

It seems if the "metrics" actuator is called first then it makes the last "metrics" call display `UNKNOWN` uri values.

NOTE: the API endpoints are now annotated with standard `jakarta.*` annotations instead of Spring ones.
