# okhttp-client

-->What is the advantage of Okhttp?
   OkHTTP is an open source project designed to be an efficient HTTP client. It supports the SPDY protocol. SPDY is the basis for HTTP 2.0 and allows multiple HTTP requests to be multiplexed over one socket connection
   OkHttp performs best when you create a single OkHttpClient instance and reuse it forall of your HTTP calls. This is because each client holds its own connection pool and threadpools. Reusing connections and threads reduces latency and saves memory. Conversely, creating aclient for each request wastes resources on idle pools. 


Consume services using the Okhttp client operations.
