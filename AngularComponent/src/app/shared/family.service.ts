import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders} from '@angular/common/http';

import { Family } from './models/family.model';
import { Father } from './models/father.model';
import { Child } from './models/child.model';
import { FamModel } from './models/famModel.model';


const httpOptions = {
	headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class FamilyService {

	constructor(private http: HttpClient) { }
	
	public createFamily(family)
	{
		let familyString = 'http://localhost:4200/api/family/';
		return this.http.post<Family>(familyString,family);
	}
	public addFatherToFamily(father)
	{
		let fatherString = 'http://localhost:4200/api/family/' + father.familyId + '/father/';
		return this.http.post<Father>(fatherString,father);
	}
	public addChildToFamily(child)
	{
		let childString = 'http://localhost:4200/api/family/' + child.familyId + '/child/';
		return this.http.post<Child>(childString,child);
	}
	public listAllFamilies()
	{
		let familyString = 'http://localhost:4200/api/family/';
		return this.http.get<Family[]>(familyString);
	}
	public readFamily(id)
	{
		let familyString = 'http://localhost:4200/api/family/' + id;
		return this.http.get<FamModel>(familyString,id);
	}
	public searchChild(familyId)
	{
		let childString = 'http://localhost:4200/api/family/' + familyId + '/child/';
		return this.http.get<Child[]>(childString, familyId);
	}
	
}
