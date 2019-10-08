import 'dart:typed_data';

import 'package:amap_location_fluttify/src/ios/ios.export.dart';
import 'package:amap_location_fluttify/src/android/android.export.dart';
import 'package:flutter/services.dart';

// ignore_for_file: non_constant_identifier_names, camel_case_types, missing_return, unused_import
class Ref_Android {
  int refId;

  Future<bool> isKindOfcom_loc_() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::isKindOfcom_loc_', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_autonavi_aps_amapapi_model_AMapLocationServer() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::isKindOfcom_autonavi_aps_amapapi_model_AMapLocationServer', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_location_AMapLocationClient() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::isKindOfcom_amap_api_location_AMapLocationClient', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_location_DPoint() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::isKindOfcom_amap_api_location_DPoint', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_location_CoordinateConverter() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::isKindOfcom_amap_api_location_CoordinateConverter', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_location_CoordUtil() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::isKindOfcom_amap_api_location_CoordUtil', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_location_UmidtokenInfo() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::isKindOfcom_amap_api_location_UmidtokenInfo', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_location_AMapLocation() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::isKindOfcom_amap_api_location_AMapLocation', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_location_AMapLocationClientOption() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::isKindOfcom_amap_api_location_AMapLocationClientOption', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_location_AMapLocationQualityReport() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::isKindOfcom_amap_api_location_AMapLocationQualityReport', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_fence_DistrictItem() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::isKindOfcom_amap_api_fence_DistrictItem', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_fence_GeoFenceClient() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::isKindOfcom_amap_api_fence_GeoFenceClient', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_fence_GeoFence() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::isKindOfcom_amap_api_fence_GeoFence', {'refId': refId});
    return result;
  }
  
  Future<bool> isKindOfcom_amap_api_fence_PoiItem() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::isKindOfcom_amap_api_fence_PoiItem', {'refId': refId});
    return result;
  }
  

  Future<com_loc_> ascom_loc_() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::ascom_loc_', {'refId': refId});
    return com_loc_()..refId = result;
  }
  
  Future<com_autonavi_aps_amapapi_model_AMapLocationServer> ascom_autonavi_aps_amapapi_model_AMapLocationServer() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::ascom_autonavi_aps_amapapi_model_AMapLocationServer', {'refId': refId});
    return com_autonavi_aps_amapapi_model_AMapLocationServer()..refId = result;
  }
  
  Future<com_amap_api_location_AMapLocationClient> ascom_amap_api_location_AMapLocationClient() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::ascom_amap_api_location_AMapLocationClient', {'refId': refId});
    return com_amap_api_location_AMapLocationClient()..refId = result;
  }
  
  Future<com_amap_api_location_DPoint> ascom_amap_api_location_DPoint() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::ascom_amap_api_location_DPoint', {'refId': refId});
    return com_amap_api_location_DPoint()..refId = result;
  }
  
  Future<com_amap_api_location_CoordinateConverter> ascom_amap_api_location_CoordinateConverter() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::ascom_amap_api_location_CoordinateConverter', {'refId': refId});
    return com_amap_api_location_CoordinateConverter()..refId = result;
  }
  
  Future<com_amap_api_location_CoordUtil> ascom_amap_api_location_CoordUtil() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::ascom_amap_api_location_CoordUtil', {'refId': refId});
    return com_amap_api_location_CoordUtil()..refId = result;
  }
  
  Future<com_amap_api_location_UmidtokenInfo> ascom_amap_api_location_UmidtokenInfo() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::ascom_amap_api_location_UmidtokenInfo', {'refId': refId});
    return com_amap_api_location_UmidtokenInfo()..refId = result;
  }
  
  Future<com_amap_api_location_AMapLocation> ascom_amap_api_location_AMapLocation() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::ascom_amap_api_location_AMapLocation', {'refId': refId});
    return com_amap_api_location_AMapLocation()..refId = result;
  }
  
  Future<com_amap_api_location_AMapLocationClientOption> ascom_amap_api_location_AMapLocationClientOption() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::ascom_amap_api_location_AMapLocationClientOption', {'refId': refId});
    return com_amap_api_location_AMapLocationClientOption()..refId = result;
  }
  
  Future<com_amap_api_location_AMapLocationQualityReport> ascom_amap_api_location_AMapLocationQualityReport() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::ascom_amap_api_location_AMapLocationQualityReport', {'refId': refId});
    return com_amap_api_location_AMapLocationQualityReport()..refId = result;
  }
  
  Future<com_amap_api_fence_DistrictItem> ascom_amap_api_fence_DistrictItem() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::ascom_amap_api_fence_DistrictItem', {'refId': refId});
    return com_amap_api_fence_DistrictItem()..refId = result;
  }
  
  Future<com_amap_api_fence_GeoFenceClient> ascom_amap_api_fence_GeoFenceClient() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::ascom_amap_api_fence_GeoFenceClient', {'refId': refId});
    return com_amap_api_fence_GeoFenceClient()..refId = result;
  }
  
  Future<com_amap_api_fence_GeoFence> ascom_amap_api_fence_GeoFence() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::ascom_amap_api_fence_GeoFence', {'refId': refId});
    return com_amap_api_fence_GeoFence()..refId = result;
  }
  
  Future<com_amap_api_fence_PoiItem> ascom_amap_api_fence_PoiItem() async {
    final result = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('RefClass::ascom_amap_api_fence_PoiItem', {'refId': refId});
    return com_amap_api_fence_PoiItem()..refId = result;
  }
  
}