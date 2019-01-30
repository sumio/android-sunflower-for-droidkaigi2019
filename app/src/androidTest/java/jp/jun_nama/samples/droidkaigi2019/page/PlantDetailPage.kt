/*
 * Copyright (C) 2019 TOYAMA Sumio <jun.nama@gmail.com>
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

package jp.jun_nama.samples.droidkaigi2019.page

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import com.google.samples.apps.sunflower.R
import org.hamcrest.Matchers

object PlantDetailPage {
    fun addToMyGarden(): PlantDetailPage {
        val floatingActionButton = Espresso.onView(
                Matchers.allOf(ViewMatchers.withId(R.id.fab),
                        childAtPosition(
                                childAtPosition(
                                        ViewMatchers.withId(R.id.garden_nav_fragment),
                                        0),
                                2),
                        ViewMatchers.isDisplayed()))
        floatingActionButton.perform(ViewActions.click())
        return PlantDetailPage
    }

    fun goBackPlantList(): PlantListPage {
        val appCompatImageButton2 = Espresso.onView(
                Matchers.allOf(ViewMatchers.withContentDescription("上へ移動"),
                        childAtPosition(
                                Matchers.allOf(ViewMatchers.withId(R.id.toolbar),
                                        childAtPosition(
                                                ViewMatchers.withId(R.id.appbar),
                                                0)),
                                1),
                        ViewMatchers.isDisplayed()))
        appCompatImageButton2.perform(ViewActions.click())
        return PlantListPage
    }
}