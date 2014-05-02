package conscript

import com.ning.http.client.Response

import org.json4s.native.JsonParser

object LiftJson {
  def As(res: Response) = JsonParser.parse(dispatch.as.String(res))
}
