package controllers

import play.api.mvc._
import javax.inject._

@Singleton
class CategoryController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getCategory(id: Long): Action[AnyContent] = Action.async {
    println("getCategory:", id)
  }

  def addCategory(): Action[AnyContent] = Action.async { implicit request =>
    println("createCategory:", request.body)
  }

  def updateCategory(id: Long): Action[AnyContent] = Action.async { implicit request =>
    println("updateCategory:", request.body)
  }

  def deleteCategory(id: Long): Action[AnyContent] = Action.async {
    println("deleteCategory:", id)
  }
}