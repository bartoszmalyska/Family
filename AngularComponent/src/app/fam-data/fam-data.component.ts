import { Component, OnInit, ViewChild} from '@angular/core';
import { Router } from '@angular/router';
import {MatPaginator, MatTableDataSource} from '@angular/material';

import { FamilyService } from '../shared/family.service';
import { Family } from '../shared/models/family.model';
import { Father } from '../shared/models/father.model';
import { Child } from '../shared/models/child.model';
import { FamModel } from '../shared/models/famModel.model';

@Component({
  selector: 'app-fam-data',
  templateUrl: './fam-data.component.html',
  styleUrls: ['./fam-data.component.css']
})
export class FamDataComponent implements OnInit {

  famModel: FamModel;
  displayedColumns: string[] = ['id','first_name','second_name','last_name','pesel','birth_date'];
  displayedColumns2: string[] = ['id','first_name','second_name','pesel','birth_date','sex'];


  constructor(private router: Router, private familyService: FamilyService) { }

  ngOnInit() {
	  this.familyService.readFamily(1).subscribe ( data => { this.famModel = data; });
  }
}
