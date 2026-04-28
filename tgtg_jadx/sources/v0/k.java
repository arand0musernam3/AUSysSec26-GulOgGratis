package v0;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m[] f41613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m[][] f41614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashSet f41615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f41616f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteOrder f41618b;

    static {
        m[] mVarArr = {new m("ImageWidth", 256, 3, 4), new m("ImageLength", 257, 3, 4), new m("Make", 271, 2), new m("Model", 272, 2), new m("Orientation", 274, 3), new m("XResolution", 282, 5), new m("YResolution", 283, 5), new m("ResolutionUnit", 296, 3), new m("Software", 305, 2), new m("DateTime", 306, 2), new m("YCbCrPositioning", 531, 3), new m("SubIFDPointer", 330, 4), new m("ExifIFDPointer", 34665, 4), new m("GPSInfoIFDPointer", 34853, 4)};
        m[] mVarArr2 = {new m("ExposureTime", 33434, 5), new m("FNumber", 33437, 5), new m("ExposureProgram", 34850, 3), new m("PhotographicSensitivity", 34855, 3), new m("SensitivityType", 34864, 3), new m("ExifVersion", 36864, 2), new m("DateTimeOriginal", 36867, 2), new m("DateTimeDigitized", 36868, 2), new m("ComponentsConfiguration", 37121, 7), new m("ShutterSpeedValue", 37377, 10), new m("ApertureValue", 37378, 5), new m("BrightnessValue", 37379, 10), new m("ExposureBiasValue", 37380, 10), new m("MaxApertureValue", 37381, 5), new m("MeteringMode", 37383, 3), new m("LightSource", 37384, 3), new m("Flash", 37385, 3), new m("FocalLength", 37386, 5), new m("SubSecTime", 37520, 2), new m("SubSecTimeOriginal", 37521, 2), new m("SubSecTimeDigitized", 37522, 2), new m("FlashpixVersion", 40960, 7), new m("ColorSpace", 40961, 3), new m("PixelXDimension", 40962, 3, 4), new m("PixelYDimension", 40963, 3, 4), new m("InteroperabilityIFDPointer", 40965, 4), new m("FocalPlaneResolutionUnit", 41488, 3), new m("SensingMethod", 41495, 3), new m("FileSource", 41728, 7), new m("SceneType", 41729, 7), new m("CustomRendered", 41985, 3), new m("ExposureMode", 41986, 3), new m("WhiteBalance", 41987, 3), new m("SceneCaptureType", 41990, 3), new m("Contrast", 41992, 3), new m("Saturation", 41993, 3), new m("Sharpness", 41994, 3)};
        m[] mVarArr3 = {new m("GPSVersionID", 0, 1), new m("GPSLatitudeRef", 1, 2), new m("GPSLatitude", 2, 5, 10), new m("GPSLongitudeRef", 3, 2), new m("GPSLongitude", 4, 5, 10), new m("GPSAltitudeRef", 5, 1), new m("GPSAltitude", 6, 5), new m("GPSTimeStamp", 7, 5), new m("GPSSpeedRef", 12, 2), new m("GPSTrackRef", 14, 2), new m("GPSImgDirectionRef", 16, 2), new m("GPSDestBearingRef", 23, 2), new m("GPSDestDistanceRef", 25, 2)};
        f41613c = new m[]{new m("SubIFDPointer", 330, 4), new m("ExifIFDPointer", 34665, 4), new m("GPSInfoIFDPointer", 34853, 4), new m("InteroperabilityIFDPointer", 40965, 4)};
        f41614d = new m[][]{mVarArr, mVarArr2, mVarArr3, new m[]{new m("InteroperabilityIndex", 1, 2)}};
        f41615e = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        f41616f = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public k(ByteOrder byteOrder, ArrayList arrayList) {
        pd.g.n("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.f41618b = byteOrder;
        this.f41617a = arrayList;
    }

    public final Map a(int i11) {
        pd.g.k(i11, 0, 4, r8.k.h(i11, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "));
        return (Map) this.f41617a.get(i11);
    }
}
