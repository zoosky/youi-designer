package io.youi.designer

import io.youi.communication.{Communication, server}
import io.youi.designer.model.Group

import scala.concurrent.Future

trait DesignerCommunication extends Communication {
  @server def saveImage(psdFileName: String, fileName: String, dataURL: String): Future[Unit]

  @server def saveImport(psdFileName: String, layer: Group): Future[Unit]
}