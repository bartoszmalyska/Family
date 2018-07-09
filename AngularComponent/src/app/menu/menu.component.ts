import { Component, OnInit, ViewChild} from '@angular/core';
import { Router } from '@angular/router';
import { FamilyService } from '../shared/family.service';
@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  constructor(private router: Router, private familyService: FamilyService) { }

  ngOnInit() {
  }
  
  public goTo(url) {
    this.router.navigate([url]).then(e => {
      if (e) {
        console.log("Navigation is successful!");
      } else {
        console.log("Navigation has failed!");
      }
    });
  }

}
