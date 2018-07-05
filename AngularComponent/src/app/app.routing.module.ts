import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { MenuComponent } from './menu/menu.component';
import { FamilyListComponent } from './family-list/family-list.component';
import { CreatorComponent } from './creator/creator.component';

const routes: Routes = [
{ path: 'menu', component: MenuComponent},
{ path: 'family', component: FamilyListComponent},
{ path: 'create', component: CreatorComponent}
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }