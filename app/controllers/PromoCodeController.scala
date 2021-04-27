package controllers

import play.api.mvc._
import javax.inject._

@Singleton
class PromoCodeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getPromoCode(id: Long): Action[AnyContent] = Action.async {
    println("getCategory:", id)
  }

  def addPromoCode(): Action[AnyContent] = Action.async { implicit request =>
    println("createCategory:", request.body)
  }

  def updatePromoCode(id: Long): Action[AnyContent] = Action.async { implicit request =>
    println("updateCategory:", request.body)
  }

  def deletePromoCode(id: Long): Action[AnyContent] = Action.async {
    println("deleteCategory:", id)
  }
}