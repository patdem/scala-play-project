package controllers

import play.api.mvc._
import javax.inject._

@Singleton
class PaymentController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getPayment(id: Long): Action[AnyContent] = Action.async {
    println("getCategory:", id)
  }

  def addPayment(): Action[AnyContent] = Action.async { implicit request =>
    println("createCategory:", request.body)
  }

  def updatePayment(id: Long): Action[AnyContent] = Action.async { implicit request =>
    println("updateCategory:", request.body)
  }

  def deletePayment(id: Long): Action[AnyContent] = Action.async {
    println("deleteCategory:", id)
  }
}