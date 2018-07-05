import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FamilyService } from './shared/family.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { MatButtonModule, MatCardModule, MatInputModule, MatListModule, MatToolbarModule, MatNativeDateModule, MatFormFieldModule, MatSelectModule, MatTableModule, MatPaginatorModule, MatDatepickerModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppComponent } from './app.component';
import { FamilyListComponent } from './family-list/family-list.component';
import { MenuComponent } from './menu/menu.component';
import { HomeComponent } from './home/home.component';
import { CreatorComponent } from './creator/creator.component';
import { FamDataComponent } from './fam-data/fam-data.component';

import { AppRoutingModule } from './app.routing.module';


@NgModule({
  declarations: [
    AppComponent,
    FamilyListComponent,
    MenuComponent,
    HomeComponent,
    CreatorComponent,
	FamDataComponent
  ],
  imports: [
    BrowserModule,
	HttpClientModule,
	BrowserAnimationsModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatListModule,
    MatToolbarModule,
	AppRoutingModule,
	MatFormFieldModule,
	MatSelectModule,
	FormsModule,
	MatTableModule,
	MatPaginatorModule,
	MatDatepickerModule,
	MatNativeDateModule
  ],
  providers: [FamilyService],
  bootstrap: [AppComponent]
})
export class AppModule { }
