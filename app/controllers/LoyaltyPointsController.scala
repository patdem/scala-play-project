package controllers

import play.api.mvc._
import javax.inject._

@Singleton
class LoyaltyPointsController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getLoyaltyPoints(id: Long): Action[AnyContent] = Action.async {
    println("getCategory:", id)
  }

  def addLoyaltyPoints(): Action[AnyContent] = Action.async { implicit request =>
    println("createCategory:", request.body)
  }

  def updateLoyaltyPoints(id: Long): Action[AnyContent] = Action.async { implicit request =>
    println("updateCategory:", request.body)
  }

  def deleteLoyaltyPoints(id: Long): Action[AnyContent] = Action.async {
    println("deleteCategory:", id)
  }
}