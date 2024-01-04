/*
 * Copyright 2024 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov

import uk.gov.hmrc.Page.{ContentPage, FormPage}
import uk.gov.hmrc.performance.conf.ServicesConfiguration

package object hmrc extends ServicesConfiguration {

  val baseUrl: String = baseUrlFor("jan-24-nic-change-frontend")
  val route: String = "/estimate-jan-24-nic-changes"

  val journey: List[Page] = List(
    ContentPage("Estimate how the January 2024 National Insurance contributions changes will affect you", ""),
    FormPage("How much is your annual salary?", "annual-salary", "value" -> "10000"),
    ContentPage("Estimate Page", "estimate")
  )
}