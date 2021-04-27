package controllers

import play.api.mvc._
import javax.inject._

@Singleton
class OrderController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getOrder(id: Long): Action[AnyContent] = Action.async {
    println("getCategory:", id)
  }

  def addOrder(): Action[AnyContent] = Action.async { implicit request =>
    println("createCategory:", request.body)
  }

  def updateOrder(id: Long): Action[AnyContent] = Action.async { implicit request =>
    println("updateCategory:", request.body)
  }

  def deleteOrder(id: Long): Action[AnyContent] = Action.async {
    println("deleteCategory:", id)
  }
}