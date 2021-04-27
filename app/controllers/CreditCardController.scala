package controllers

import play.api.mvc._
import javax.inject._

@Singleton
class CreditCardController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getCreditCard(id: Long): Action[AnyContent] = Action.async {
    println("getCategory:", id)
  }

  def addCreditCard(): Action[AnyContent] = Action.async { implicit request =>
    println("createCategory:", request.body)
  }

  def updateCreditCard(id: Long): Action[AnyContent] = Action.async { implicit request =>
    println("updateCategory:", request.body)
  }

  def deleteCreditCard(id: Long): Action[AnyContent] = Action.async {
    println("deleteCategory:", id)
  }
}