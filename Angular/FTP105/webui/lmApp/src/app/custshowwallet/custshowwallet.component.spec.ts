/*import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import {HttpClient} from '@angular/common/http';
import { CustshowwalletComponent } from './custshowwallet.component';
import { CustomerService } from '../customer.service';
import { Customer } from '../customer';
import { of } from 'rxjs';

describe('CustshowwalletComponent', () => {
  let service:CustomerService;
  let httpClient:HttpClient;
  let component: CustshowwalletComponent;
  let fixture: ComponentFixture<CustshowwalletComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustshowwalletComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
 service=new CustomerService(httpClient);
 component=new CustshowwalletComponent(service);
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should call ngOnInit with success', () => {
    let wallet:Customer=[
      new Customer(1,'sivaram',1139.64,'siva','pass001')
    ];
    localStorage.setItem('cid','1');
    spyOn(service,'getWallet').and.returnValue(of(wallet));
    component.ngOnInit();
   expect(component.wallet).toEqual(wallet);
   expect(component.wallet).not.toEqual(wallet);
 
  });

});
*/