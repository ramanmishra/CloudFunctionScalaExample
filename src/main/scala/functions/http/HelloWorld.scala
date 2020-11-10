package functions.http

import com.google.cloud.functions.{HttpFunction, HttpRequest, HttpResponse}

class HelloWorld extends HttpFunction {
  override def service(request: HttpRequest, response: HttpResponse): Unit = {
    val writer = response.getWriter
    writer.write("Hello world!")
  }
}