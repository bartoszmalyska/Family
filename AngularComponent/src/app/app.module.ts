import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { FamilyListComponent } from './components/family-list/family-list.component';
import { FatherCreatorComponent } from './components/father-creator/father-creator.component';
import { ChildCreatorComponent } from './components/child-creator/child-creator.component';


@NgModule({
  declarations: [
    AppComponent,
    FamilyListComponent,
    FatherCreatorComponent,
    ChildCreatorComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
