package v0;

import c5.a1;
import com.braze.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a1 f41591b = new a1(11);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a1 f41592c = new a1(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a1 f41593d = new a1(13);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f41594e = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f41595f = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o8.h f41596a;

    public d(o8.h hVar) {
        this.f41596a = hVar;
    }

    public final void a(d dVar) {
        o8.h hVar = dVar.f41596a;
        ArrayList<String> arrayList = new ArrayList(f41594e);
        arrayList.removeAll(f41595f);
        for (String str : arrayList) {
            String strC = this.f41596a.c(str);
            String strC2 = hVar.c(str);
            if (strC != null && !strC.equals(strC2)) {
                hVar.E(str, strC);
            }
        }
    }

    public final int b() {
        switch (this.f41596a.d(0, "Orientation")) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void c(int i11) {
        int i12 = i11 % 90;
        o8.h hVar = this.f41596a;
        if (i12 != 0) {
            Locale locale = Locale.US;
            wd.a.I(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "Can only rotate in right angles (eg. 0, 90, 180, 270). " + i11 + " is unsupported.");
            hVar.E("Orientation", String.valueOf(0));
            return;
        }
        int i13 = i11 % 360;
        int iD = hVar.d(0, "Orientation");
        while (i13 < 0) {
            i13 += 90;
            switch (iD) {
                case 2:
                    iD = 5;
                    break;
                case 3:
                case 8:
                    iD = 6;
                    break;
                case 4:
                    iD = 7;
                    break;
                case 5:
                    iD = 4;
                    break;
                case 6:
                    iD = 1;
                    break;
                case 7:
                    iD = 2;
                    break;
                default:
                    iD = 8;
                    break;
            }
        }
        while (i13 > 0) {
            i13 -= 90;
            switch (iD) {
                case 2:
                    iD = 7;
                    break;
                case 3:
                    iD = 8;
                    break;
                case 4:
                    iD = 5;
                    break;
                case 5:
                    iD = 2;
                    break;
                case 6:
                    iD = 3;
                    break;
                case 7:
                    iD = 4;
                    break;
                case 8:
                    iD = 1;
                    break;
                default:
                    iD = 6;
                    break;
            }
        }
        hVar.E("Orientation", String.valueOf(iD));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0127 A[Catch: all -> 0x0130, Exception -> 0x0133, TryCatch #16 {Exception -> 0x0133, all -> 0x0130, blocks: (B:81:0x0123, B:83:0x0127, B:90:0x0145, B:89:0x0136), top: B:140:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0136 A[Catch: all -> 0x0130, Exception -> 0x0133, TryCatch #16 {Exception -> 0x0133, all -> 0x0130, blocks: (B:81:0x0123, B:83:0x0127, B:90:0x0145, B:89:0x0136), top: B:140:0x0123 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.d.d():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01af, code lost:
    
        if (r3.equals("M") != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117 A[Catch: ParseException -> 0x0110, TRY_ENTER, TryCatch #0 {ParseException -> 0x0110, blocks: (B:55:0x0117, B:58:0x0130), top: B:119:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.d.toString():java.lang.String");
    }
}
