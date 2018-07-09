import { RouterModule, Routes } from '@angular/router';
import { ModuleWithProviders } from "@angular/core";

import { MenuComponent } from './menu/menu.component';
import { FamilyListComponent } from './family-list/family-list.component';
import { CreatorComponent } from './creator/creator.component';
import { FamDataComponent } from './fam-data/fam-data.component';
import { HomeComponent } from './home/home.component';


const routes: Routes = [
{ path: 'menu', component: MenuComponent},
{ path: 'family', component: FamilyListComponent},
{ path: 'create', component: CreatorComponent},
{ path: 'home', component: HomeComponent},
{ path: 'data', component: FamDataComponent}
];

export const AppRoutingModule: ModuleWithProviders = RouterModule.forRoot(routes);