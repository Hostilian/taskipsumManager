import { IAuthority, NewAuthority } from './authority.model';

export const sampleWithRequiredData: IAuthority = {
  name: '806fb79a-0084-4a53-aeef-7dbf57c85cb2',
};

export const sampleWithPartialData: IAuthority = {
  name: '227216c5-f6e4-45f4-b6e7-9112ab27f475',
};

export const sampleWithFullData: IAuthority = {
  name: 'bdadae01-acb2-4d0e-89e3-830529fbc3e3',
};

export const sampleWithNewData: NewAuthority = {
  name: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
