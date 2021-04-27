package controllers

import play.api.mvc._
import javax.inject._

@Singleton
class VoucherController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getVoucher(id: Long): Action[AnyContent] = Action.async {
    println("getCategory:", id)
  }

  def addVoucher(): Action[AnyContent] = Action.async { implicit request =>
    println("createCategory:", request.body)
  }

  def updateVoucher(id: Long): Action[AnyContent] = Action.async { implicit request =>
    println("updateCategory:", request.body)
  }

  def deleteVoucher(id: Long): Action[AnyContent] = Action.async {
    println("deleteCategory:", id)
  }
}