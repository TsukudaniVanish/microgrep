// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class MySuite extends munit.FunSuite {
  test("example test that succeeds") {
    val obtained = 42
    val expected = 42
    assertEquals(obtained, expected)
  }
  test("string serch") {
    val key = "Hi"
    val dst = """
this is test
Hi! my name is Yuya.
Thank you.
hike
              """
    val l = (dst <<: key).toList
    assertEquals(l, List("Hi! my name is Yuya."))
  }
}
