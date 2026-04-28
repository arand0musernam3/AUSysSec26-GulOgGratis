package o8;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import c50.w;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.braze.h2;
import com.braze.models.inappmessage.InAppMessageBase;
import j4.s;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import r8.k;
import wy.o;
import zendesk.core.android.internal.DateKtxConstants;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final e W;
    public static final e[][] X;
    public static final e[] Y;
    public static final HashMap[] Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final HashMap[] f32069a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Set f32070b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final HashMap f32071c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Charset f32072d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final byte[] f32073e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final byte[] f32074f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Pattern f32075g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Pattern f32076h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Pattern f32077i0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileDescriptor f32084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AssetManager.AssetInputStream f32085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f32087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap[] f32088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f32089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteOrder f32090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f32091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f32092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f32093k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f32094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f32095n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f32096o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f32097p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f32098q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f32099r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f32100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f32101t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f32102u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f32078v = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final List f32079w = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final List f32080x = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f32081y = {8, 8, 8};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f32082z = {8};
    public static final byte[] A = {-1, -40, -1};
    public static final byte[] B = {102, 116, 121, 112};
    public static final byte[] C = {109, 105, 102, 49};
    public static final byte[] D = {104, 101, 105, 99};
    public static final byte[] E = {97, 118, 105, 102};
    public static final byte[] F = {97, 118, 105, 115};
    public static final byte[] G = {79, 76, 89, 77, 80, 0};
    public static final byte[] H = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] I = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] J = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    public static final byte[] K = {82, 73, 70, 70};
    public static final byte[] L = {87, 69, 66, 80};
    public static final byte[] M = {69, 88, 73, 70};
    public static final byte[] N = {-99, 1, 42};
    public static final byte[] O = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] P = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] R = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] S = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] T = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] U = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] V = {65, 83, 67, 73, 73, 0, 0, 0};

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        W = new e("StripOffsets", 273, 3);
        X = new e[][]{eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, new e[]{new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)}, new e[]{new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)}, new e[]{new e("AspectFrame", 4371, 3)}, new e[]{new e("ColorSpace", 55, 3)}};
        Y = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        Z = new HashMap[10];
        f32069a0 = new HashMap[10];
        f32070b0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f32071c0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f32072d0 = charsetForName;
        f32073e0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f32074f0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone(DateKtxConstants.UTC_TIMEZONE));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone(DateKtxConstants.UTC_TIMEZONE));
        int i11 = 0;
        while (true) {
            e[][] eVarArr6 = X;
            if (i11 >= eVarArr6.length) {
                HashMap map = f32071c0;
                e[] eVarArr7 = Y;
                map.put(Integer.valueOf(eVarArr7[0].f32063a), 5);
                map.put(Integer.valueOf(eVarArr7[1].f32063a), 1);
                map.put(Integer.valueOf(eVarArr7[2].f32063a), 2);
                map.put(Integer.valueOf(eVarArr7[3].f32063a), 3);
                map.put(Integer.valueOf(eVarArr7[4].f32063a), 7);
                map.put(Integer.valueOf(eVarArr7[5].f32063a), 8);
                Pattern.compile(".*[1-9].*");
                f32075g0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f32076h0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f32077i0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            Z[i11] = new HashMap();
            f32069a0[i11] = new HashMap();
            for (e eVar : eVarArr6[i11]) {
                Z[i11].put(Integer.valueOf(eVar.f32063a), eVar);
                f32069a0[i11].put(eVar.f32064b, eVar);
            }
            i11++;
        }
    }

    public h(String str) throws Throwable {
        FileInputStream fileInputStream;
        boolean z11;
        e[][] eVarArr = X;
        this.f32088f = new HashMap[eVarArr.length];
        this.f32089g = new HashSet(eVarArr.length);
        this.f32090h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            w.l("filename cannot be null");
            throw null;
        }
        FileInputStream fileInputStream2 = null;
        this.f32085c = null;
        this.f32083a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z11 = true;
            } catch (Exception unused) {
                if (f32078v) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                z11 = false;
            }
            if (z11) {
                this.f32084b = fileInputStream.getFD();
            } else {
                this.f32084b = null;
            }
            t(fileInputStream);
            a.a.u(fileInputStream);
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            a.a.u(fileInputStream2);
            throw th;
        }
    }

    public static double b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(MessageLogView.COMMA_SEPARATOR, -1);
            String[] strArrSplit2 = strArrSplit[0].split(ExpiryDateInput.SEPARATOR, -1);
            double d3 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split(ExpiryDateInput.SEPARATOR, -1);
            double d11 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split(ExpiryDateInput.SEPARATOR, -1);
            double d12 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d11 / 60.0d) + d3;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d12;
            }
            return -d12;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static Pair q(String str) {
        if (str.contains(MessageLogView.COMMA_SEPARATOR)) {
            String[] strArrSplit = str.split(MessageLogView.COMMA_SEPARATOR, -1);
            Pair pairQ = q(strArrSplit[0]);
            if (((Integer) pairQ.first).intValue() == 2) {
                return pairQ;
            }
            for (int i11 = 1; i11 < strArrSplit.length; i11++) {
                Pair pairQ2 = q(strArrSplit[i11]);
                int iIntValue = (((Integer) pairQ2.first).equals(pairQ.first) || ((Integer) pairQ2.second).equals(pairQ.first)) ? ((Integer) pairQ.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairQ.second).intValue() == -1 || !(((Integer) pairQ2.first).equals(pairQ.second) || ((Integer) pairQ2.second).equals(pairQ.second))) ? -1 : ((Integer) pairQ.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairQ = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairQ = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairQ;
        }
        if (!str.contains(ExpiryDateInput.SEPARATOR)) {
            try {
                try {
                    long j9 = Long.parseLong(str);
                    return (j9 < 0 || j9 > 65535) ? j9 < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split(ExpiryDateInput.SEPARATOR, -1);
        if (strArrSplit2.length == 2) {
            try {
                long j11 = (long) Double.parseDouble(strArrSplit2[0]);
                long j12 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j11 >= 0 && j12 >= 0) {
                    if (j11 <= 2147483647L && j12 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public static ByteOrder w(b bVar) throws IOException {
        short s7 = bVar.readShort();
        boolean z11 = f32078v;
        if (s7 == 18761) {
            if (z11) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s7 != 19789) {
            o.o(Integer.toHexString(s7), "Invalid byte order: ");
            return null;
        }
        if (z11) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void A(int i11, String str, String str2) {
        HashMap[] mapArr = this.f32088f;
        if (mapArr[i11].isEmpty() || mapArr[i11].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i11];
        map.put(str2, (d) map.get(str));
        mapArr[i11].remove(str);
    }

    public final void B(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        byte b8;
        if (f32078v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            i4.a.k("Invalid marker");
            return;
        }
        cVar.a(-1);
        if (bVar.readByte() != -40) {
            i4.a.k("Invalid marker");
            return;
        }
        cVar.a(-40);
        cVar.a(-1);
        cVar.a(-31);
        this.f32097p = J(cVar);
        d dVar = this.f32101t;
        byte[] bArr = f32074f0;
        if (dVar != null) {
            cVar.write(-1);
            cVar.a(-31);
            cVar.r(bArr.length + 2 + this.f32101t.f32062d.length);
            cVar.write(bArr);
            cVar.write(this.f32101t.f32062d);
            this.f32102u = true;
        }
        byte[] bArr2 = new byte[4096];
        while (bVar.readByte() == -1) {
            do {
                b8 = bVar.readByte();
            } while (b8 == -1);
            if (b8 == -39 || b8 == -38) {
                cVar.a(-1);
                cVar.a(b8);
                a.a.y(bVar, cVar);
                return;
            }
            if (b8 != -31) {
                cVar.a(-1);
                cVar.a(b8);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.r(unsignedShort);
                int i11 = unsignedShort - 2;
                if (i11 < 0) {
                    i4.a.k("Invalid length");
                    return;
                }
                while (i11 > 0) {
                    int i12 = bVar.read(bArr2, 0, Math.min(i11, 4096));
                    if (i12 >= 0) {
                        cVar.write(bArr2, 0, i12);
                        i11 -= i12;
                    }
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int length = unsignedShort2 - 2;
                if (length < 0) {
                    i4.a.k("Invalid length");
                    return;
                }
                int length2 = bArr.length;
                byte[] bArr3 = f32073e0;
                byte[] bArr4 = length >= length2 ? new byte[bArr.length] : length >= bArr3.length ? new byte[bArr3.length] : null;
                if (bArr4 != null) {
                    bVar.readFully(bArr4);
                    if (a.a.L(bArr4, bArr3) || a.a.L(bArr4, bArr)) {
                        bVar.a(length - bArr4.length);
                    }
                }
                cVar.a(-1);
                cVar.a(b8);
                cVar.r(unsignedShort2);
                if (bArr4 != null) {
                    length -= bArr4.length;
                    cVar.write(bArr4);
                }
                while (length > 0) {
                    int i13 = bVar.read(bArr2, 0, Math.min(length, 4096));
                    if (i13 >= 0) {
                        cVar.write(bArr2, 0, i13);
                        length -= i13;
                    }
                }
            }
        }
        i4.a.k("Invalid marker");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(java.io.BufferedInputStream r9, java.io.BufferedOutputStream r10) {
        /*
            r8 = this;
            boolean r0 = o8.h.f32078v
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "savePngAttributes starting with (inputStream: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = ", outputStream: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L24:
            o8.b r0 = new o8.b
            r0.<init>(r9)
            o8.c r9 = new o8.c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = o8.h.I
            int r10 = r10.length
            a.a.z(r0, r9, r10)
            o8.d r10 = r8.f32101t
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L40
            boolean r10 = r8.f32102u
            if (r10 == 0) goto L75
        L40:
            r10 = r1
        L41:
            if (r1 != 0) goto L4a
            if (r10 == 0) goto L46
            goto L4a
        L46:
            a.a.y(r0, r9)
            return
        L4a:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L77
            r9.e(r3)
            r9.e(r4)
            int r3 = r3 + 4
            a.a.z(r0, r9, r3)
            int r3 = r8.f32097p
            if (r3 != 0) goto L6a
            r8.K(r9)
            r1 = r2
        L6a:
            o8.d r3 = r8.f32101t
            if (r3 == 0) goto L41
            boolean r3 = r8.f32102u
            if (r3 != 0) goto L41
            r8.L(r9)
        L75:
            r10 = r2
            goto L41
        L77:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L88
            if (r1 == 0) goto L88
            r8.K(r9)
            int r3 = r3 + 4
            r0.a(r3)
            r1 = r2
            goto L41
        L88:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto Lba
            byte[] r5 = o8.h.J
            int r6 = r5.length
            if (r3 < r6) goto Lba
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto Lad
            o8.d r10 = r8.f32101t
            if (r10 == 0) goto La9
            r8.L(r9)
        La9:
            r0.a(r6)
            goto L75
        Lad:
            r9.e(r3)
            r9.e(r4)
            r9.write(r7)
            a.a.z(r0, r9, r6)
            goto L41
        Lba:
            r9.e(r3)
            r9.e(r4)
            int r3 = r3 + 4
            a.a.z(r0, r9, r3)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.h.C(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|2|(1:4)|5|140|6|146|7|8|145|(4:10|(1:12)|13|14)(3:20|21|(7:23|(1:25)(1:26)|27|(1:29)(1:30)|31|(4:33|(3:34|(1:36)|37)|(5:40|143|41|42|(1:154)(3:46|(2:48|155)(1:156)|49))|45)(2:(4:50|(1:52)|53|(1:159)(2:162|160))|58)|59)(6:60|61|(22:67|(1:69)(1:71)|70|72|73|(2:75|(1:77)(2:78|79))(3:80|81|(2:83|(3:85|(1:87)(1:88)|89)(2:90|91))(1:92))|93|(1:95)(1:97)|98|99|151|100|(1:102)(2:108|(2:110|111))|112|113|114|(1:116)|117|149|118|119|120)(1:66)|124|136|137))|15|113|114|(0)|117|149|118|119|120|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0295, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0298, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027e A[Catch: all -> 0x0246, Exception -> 0x024b, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x024b, all -> 0x0246, blocks: (B:116:0x027e, B:102:0x023c, B:111:0x0257), top: B:145:0x0056 }] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.io.BufferedOutputStream, java.io.OutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v10, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(java.io.BufferedInputStream r23, java.io.BufferedOutputStream r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.h.D(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0489  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(java.lang.String r36, java.lang.String r37) {
        /*
            Method dump skipped, instruction units count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.h.E(java.lang.String, java.lang.String):void");
    }

    public final void F(b bVar) throws Throwable {
        String str;
        d dVar;
        int i11;
        HashMap map = this.f32088f[4];
        d dVar2 = (d) map.get("Compression");
        if (dVar2 == null) {
            this.f32096o = 6;
            r(bVar, map);
            return;
        }
        int i12 = dVar2.i(this.f32090h);
        this.f32096o = i12;
        int i13 = 1;
        if (i12 != 1) {
            if (i12 == 6) {
                r(bVar, map);
                return;
            } else if (i12 != 7) {
                return;
            }
        }
        d dVar3 = (d) map.get("BitsPerSample");
        String str2 = "ExifInterface";
        if (dVar3 != null) {
            int[] iArr = (int[]) dVar3.k(this.f32090h);
            int[] iArr2 = f32081y;
            if (Arrays.equals(iArr2, iArr) || (this.f32086d == 3 && (dVar = (d) map.get("PhotometricInterpretation")) != null && (((i11 = dVar.i(this.f32090h)) == 1 && Arrays.equals(iArr, f32082z)) || (i11 == 6 && Arrays.equals(iArr, iArr2))))) {
                d dVar4 = (d) map.get("StripOffsets");
                d dVar5 = (d) map.get("StripByteCounts");
                if (dVar4 == null || dVar5 == null) {
                    return;
                }
                long[] jArrX = a.a.x(dVar4.k(this.f32090h));
                long[] jArrX2 = a.a.x(dVar5.k(this.f32090h));
                if (jArrX == null || jArrX.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrX2 == null || jArrX2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrX.length != jArrX2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j9 = 0;
                for (long j11 : jArrX2) {
                    j9 += j11;
                }
                int i14 = (int) j9;
                byte[] bArr = new byte[i14];
                this.f32093k = true;
                this.f32092j = true;
                this.f32091i = true;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (i15 < jArrX.length) {
                    int i18 = (int) jArrX[i15];
                    int i19 = (int) jArrX2[i15];
                    if (i15 < jArrX.length - i13) {
                        str = str2;
                        if (i18 + i19 != jArrX[i15 + 1]) {
                            this.f32093k = false;
                        }
                    } else {
                        str = str2;
                    }
                    int i21 = i18 - i16;
                    if (i21 < 0) {
                        Log.d(str, "Invalid strip offset value");
                        return;
                    }
                    String str3 = str;
                    try {
                        bVar.a(i21);
                        int i22 = i16 + i21;
                        byte[] bArr2 = new byte[i19];
                        try {
                            bVar.readFully(bArr2);
                            i16 = i22 + i19;
                            System.arraycopy(bArr2, 0, bArr, i17, i19);
                            i17 += i19;
                            i15++;
                            str2 = str3;
                            i13 = 1;
                        } catch (EOFException unused) {
                            Log.d(str3, "Failed to read " + i19 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d(str3, "Failed to skip " + i21 + " bytes.");
                        return;
                    }
                }
                this.f32095n = bArr;
                if (this.f32093k) {
                    this.l = (int) jArrX[0];
                    this.f32094m = i14;
                    return;
                }
                return;
            }
        }
        if (f32078v) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void G(int i11, int i12) throws Throwable {
        HashMap[] mapArr = this.f32088f;
        boolean zIsEmpty = mapArr[i11].isEmpty();
        boolean z11 = f32078v;
        if (zIsEmpty || mapArr[i12].isEmpty()) {
            if (z11) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = (d) mapArr[i11].get("ImageLength");
        d dVar2 = (d) mapArr[i11].get("ImageWidth");
        d dVar3 = (d) mapArr[i12].get("ImageLength");
        d dVar4 = (d) mapArr[i12].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (z11) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (z11) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int i13 = dVar.i(this.f32090h);
        int i14 = dVar2.i(this.f32090h);
        int i15 = dVar3.i(this.f32090h);
        int i16 = dVar4.i(this.f32090h);
        if (i13 >= i15 || i14 >= i16) {
            return;
        }
        HashMap map = mapArr[i11];
        mapArr[i11] = mapArr[i12];
        mapArr[i12] = map;
    }

    public final void H(g gVar, int i11) throws Throwable {
        d dVarF;
        d dVarF2;
        HashMap[] mapArr = this.f32088f;
        d dVar = (d) mapArr[i11].get("DefaultCropSize");
        d dVar2 = (d) mapArr[i11].get("SensorTopBorder");
        d dVar3 = (d) mapArr[i11].get("SensorLeftBorder");
        d dVar4 = (d) mapArr[i11].get("SensorBottomBorder");
        d dVar5 = (d) mapArr[i11].get("SensorRightBorder");
        if (dVar != null) {
            int i12 = dVar.f32059a;
            ByteOrder byteOrder = this.f32090h;
            if (i12 == 5) {
                f[] fVarArr = (f[]) dVar.k(byteOrder);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                } else {
                    dVarF = d.e(new f[]{fVarArr[0]}, this.f32090h);
                    dVarF2 = d.e(new f[]{fVarArr[1]}, this.f32090h);
                }
            } else {
                int[] iArr = (int[]) dVar.k(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                dVarF = d.f(iArr[0], this.f32090h);
                dVarF2 = d.f(iArr[1], this.f32090h);
            }
            mapArr[i11].put("ImageWidth", dVarF);
            mapArr[i11].put("ImageLength", dVarF2);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int i13 = dVar2.i(this.f32090h);
            int i14 = dVar4.i(this.f32090h);
            int i15 = dVar5.i(this.f32090h);
            int i16 = dVar3.i(this.f32090h);
            if (i14 <= i13 || i15 <= i16) {
                return;
            }
            d dVarF3 = d.f(i14 - i13, this.f32090h);
            d dVarF4 = d.f(i15 - i16, this.f32090h);
            mapArr[i11].put("ImageLength", dVarF3);
            mapArr[i11].put("ImageWidth", dVarF4);
            return;
        }
        d dVar6 = (d) mapArr[i11].get("ImageLength");
        d dVar7 = (d) mapArr[i11].get("ImageWidth");
        if (dVar6 == null || dVar7 == null) {
            d dVar8 = (d) mapArr[i11].get("JPEGInterchangeFormat");
            d dVar9 = (d) mapArr[i11].get("JPEGInterchangeFormatLength");
            if (dVar8 == null || dVar9 == null) {
                return;
            }
            int i17 = dVar8.i(this.f32090h);
            int i18 = dVar8.i(this.f32090h);
            gVar.e(i17);
            byte[] bArr = new byte[i18];
            gVar.readFully(bArr);
            g(new b(bArr), i17, i11);
        }
    }

    public final void I() throws Throwable {
        G(0, 5);
        G(0, 4);
        G(5, 4);
        HashMap[] mapArr = this.f32088f;
        d dVar = (d) mapArr[1].get("PixelXDimension");
        d dVar2 = (d) mapArr[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            mapArr[0].put("ImageWidth", dVar);
            mapArr[0].put("ImageLength", dVar2);
        }
        if (mapArr[4].isEmpty() && s(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!s(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        A(0, "ThumbnailOrientation", "Orientation");
        A(0, "ThumbnailImageLength", "ImageLength");
        A(0, "ThumbnailImageWidth", "ImageWidth");
        A(5, "ThumbnailOrientation", "Orientation");
        A(5, "ThumbnailImageLength", "ImageLength");
        A(5, "ThumbnailImageWidth", "ImageWidth");
        A(4, "Orientation", "ThumbnailOrientation");
        A(4, "ImageLength", "ThumbnailImageLength");
        A(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final int J(c cVar) throws IOException {
        HashMap[] mapArr;
        int i11;
        int i12;
        char c3;
        char c7;
        int[] iArr;
        int i13;
        e[][] eVarArr = X;
        int[] iArr2 = new int[eVarArr.length];
        int[] iArr3 = new int[eVarArr.length];
        e[] eVarArr2 = Y;
        for (e eVar : eVarArr2) {
            z(eVar.f32064b);
        }
        if (this.f32091i) {
            if (this.f32092j) {
                z("StripOffsets");
                z("StripByteCounts");
            } else {
                z("JPEGInterchangeFormat");
                z("JPEGInterchangeFormatLength");
            }
        }
        int i14 = 0;
        while (true) {
            int length = eVarArr.length;
            mapArr = this.f32088f;
            if (i14 >= length) {
                break;
            }
            Iterator it = mapArr[i14].entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    it.remove();
                }
            }
            i14++;
        }
        if (mapArr[1].isEmpty()) {
            i11 = 1;
            i12 = 0;
        } else {
            i11 = 1;
            i12 = 0;
            mapArr[0].put(eVarArr2[1].f32064b, d.c(0L, this.f32090h));
        }
        if (mapArr[2].isEmpty()) {
            c3 = 2;
        } else {
            c3 = 2;
            mapArr[i12].put(eVarArr2[2].f32064b, d.c(0L, this.f32090h));
        }
        if (mapArr[3].isEmpty()) {
            c7 = 3;
        } else {
            c7 = 3;
            mapArr[i11].put(eVarArr2[3].f32064b, d.c(0L, this.f32090h));
        }
        int i15 = 4;
        if (this.f32091i) {
            if (this.f32092j) {
                mapArr[4].put("StripOffsets", d.f(i12, this.f32090h));
                mapArr[4].put("StripByteCounts", d.f(this.f32094m, this.f32090h));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.c(0L, this.f32090h));
                mapArr[4].put("JPEGInterchangeFormatLength", d.c(this.f32094m, this.f32090h));
            }
        }
        int i16 = 0;
        while (true) {
            int length2 = eVarArr.length;
            iArr = U;
            if (i16 >= length2) {
                break;
            }
            Iterator it2 = mapArr[i16].entrySet().iterator();
            int i17 = 0;
            while (it2.hasNext()) {
                d dVar = (d) ((Map.Entry) it2.next()).getValue();
                dVar.getClass();
                int i18 = iArr[dVar.f32059a] * dVar.f32060b;
                if (i18 > 4) {
                    i17 += i18;
                }
            }
            iArr3[i16] = iArr3[i16] + i17;
            i16++;
        }
        int size = 8;
        for (int i19 = 0; i19 < eVarArr.length; i19++) {
            if (!mapArr[i19].isEmpty()) {
                iArr2[i19] = size;
                size = (mapArr[i19].size() * 12) + 6 + iArr3[i19] + size;
            }
        }
        if (this.f32091i) {
            if (this.f32092j) {
                mapArr[4].put("StripOffsets", d.f(size, this.f32090h));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.c(size, this.f32090h));
            }
            this.l = size;
            size += this.f32094m;
        }
        if (this.f32086d == 4) {
            size += 8;
        }
        if (f32078v) {
            for (int i21 = 0; i21 < eVarArr.length; i21++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i21), Integer.valueOf(iArr2[i21]), Integer.valueOf(mapArr[i21].size()), Integer.valueOf(iArr3[i21]), Integer.valueOf(size)));
            }
        }
        if (!mapArr[i11].isEmpty()) {
            mapArr[0].put(eVarArr2[i11].f32064b, d.c(iArr2[i11], this.f32090h));
        }
        if (!mapArr[c3].isEmpty()) {
            mapArr[0].put(eVarArr2[c3].f32064b, d.c(iArr2[c3], this.f32090h));
        }
        if (!mapArr[c7].isEmpty()) {
            mapArr[i11].put(eVarArr2[c7].f32064b, d.c(iArr2[c7], this.f32090h));
        }
        int i22 = this.f32086d;
        if (i22 == 4) {
            if (size > 65535) {
                h2.b(k.h(size, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
                return 0;
            }
            cVar.r(size);
            cVar.write(f32073e0);
        } else if (i22 == 13) {
            cVar.e(size);
            cVar.e(1700284774);
        } else if (i22 == 14) {
            cVar.write(M);
            cVar.e(size);
        }
        int size2 = ((DataOutputStream) cVar.f32058c).size();
        cVar.g(this.f32090h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.f32057b = this.f32090h;
        cVar.r(42);
        cVar.p(8L);
        int i23 = 0;
        while (i23 < eVarArr.length) {
            if (mapArr[i23].isEmpty()) {
                i13 = i15;
            } else {
                cVar.r(mapArr[i23].size());
                int size3 = (mapArr[i23].size() * 12) + iArr2[i23] + 2 + i15;
                for (Map.Entry entry : mapArr[i23].entrySet()) {
                    int i24 = ((e) f32069a0[i23].get(entry.getKey())).f32063a;
                    d dVar2 = (d) entry.getValue();
                    dVar2.getClass();
                    int i25 = dVar2.f32060b;
                    int i26 = dVar2.f32059a;
                    int i27 = iArr[i26] * i25;
                    cVar.r(i24);
                    cVar.r(i26);
                    cVar.e(i25);
                    if (i27 > 4) {
                        cVar.p(size3);
                        size3 += i27;
                    } else {
                        cVar.write(dVar2.f32062d);
                        if (i27 < 4) {
                            while (i27 < 4) {
                                cVar.a(0);
                                i27++;
                            }
                        }
                    }
                    i15 = 4;
                }
                int i28 = i15;
                if (i23 != 0 || mapArr[i28].isEmpty()) {
                    cVar.p(0L);
                } else {
                    cVar.p(iArr2[i28]);
                }
                Iterator it3 = mapArr[i23].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = ((d) ((Map.Entry) it3.next()).getValue()).f32062d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
                i13 = 4;
            }
            i23++;
            i15 = i13;
        }
        if (this.f32091i) {
            cVar.write(o());
        }
        if (this.f32086d == 14 && size % 2 == i11) {
            cVar.a(0);
        }
        cVar.f32057b = ByteOrder.BIG_ENDIAN;
        return size2;
    }

    public final void K(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f32097p = ((DataOutputStream) cVar.f32058c).size() + J(new c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.e((int) crc32.getValue());
    }

    public final void L(c cVar) throws IOException {
        cVar.e(this.f32101t.f32062d.length + 22);
        CRC32 crc32 = new CRC32();
        cVar.e(1767135348);
        crc32.update(105);
        crc32.update(26964);
        crc32.update(6902872);
        crc32.update(1767135348);
        byte[] bArr = J;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.f32101t.f32062d);
        crc32.update(this.f32101t.f32062d);
        cVar.e((int) crc32.getValue());
        this.f32102u = true;
    }

    public final void a() {
        String strC = c("DateTimeOriginal");
        HashMap[] mapArr = this.f32088f;
        if (strC != null && c("DateTime") == null) {
            mapArr[0].put("DateTime", d.b(strC));
        }
        if (c("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", d.c(0L, this.f32090h));
        }
        if (c("ImageLength") == null) {
            mapArr[0].put("ImageLength", d.c(0L, this.f32090h));
        }
        if (c("Orientation") == null) {
            mapArr[0].put("Orientation", d.c(0L, this.f32090h));
        }
        if (c("LightSource") == null) {
            mapArr[1].put("LightSource", d.c(0L, this.f32090h));
        }
    }

    public final String c(String str) {
        if (str == null) {
            w.l("tag shouldn't be null");
            return null;
        }
        d dVarE = e(str);
        if (dVarE != null) {
            int i11 = dVarE.f32059a;
            if (str.equals("GPSTimeStamp")) {
                if (i11 != 5 && i11 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i11);
                    return null;
                }
                f[] fVarArr = (f[]) dVarE.k(this.f32090h);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (fVar.f32067a / fVar.f32068b));
                f fVar2 = fVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (fVar2.f32067a / fVar2.f32068b));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f32067a / fVar3.f32068b)));
            }
            boolean zContains = f32070b0.contains(str);
            ByteOrder byteOrder = this.f32090h;
            if (!zContains) {
                return dVarE.j(byteOrder);
            }
            try {
                return Double.toString(dVarE.h(byteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int d(int i11, String str) {
        d dVarE = e(str);
        if (dVarE == null) {
            return i11;
        }
        try {
            return dVarE.i(this.f32090h);
        } catch (NumberFormatException unused) {
            return i11;
        }
    }

    public final d e(String str) {
        d dVar;
        int i11;
        d dVar2;
        if (str == null) {
            w.l("tag shouldn't be null");
            return null;
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f32078v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i11 = this.f32086d) != 4 && ((i11 == 9 || i11 == 15 || i11 == 12 || i11 == 13) && (dVar2 = this.f32101t) != null)) {
            return dVar2;
        }
        for (int i12 = 0; i12 < X.length; i12++) {
            d dVar3 = (d) this.f32088f[i12].get(str);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        if (!"Xmp".equals(str) || (dVar = this.f32101t) == null) {
            return null;
        }
        return dVar;
    }

    public final void f(g gVar, int i11) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 28) {
            h2.a("Reading EXIF from HEIC files is supported from SDK 28 and above");
            return;
        }
        if (i11 == 15 && i12 < 31) {
            h2.a("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new a(gVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f32088f;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", d.f(Integer.parseInt(strExtractMetadata), this.f32090h));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", d.f(Integer.parseInt(strExtractMetadata3), this.f32090h));
                }
                if (strExtractMetadata2 != null) {
                    int i13 = Integer.parseInt(strExtractMetadata2);
                    mapArr[0].put("Orientation", d.f(i13 != 90 ? i13 != 180 ? i13 != 270 ? 1 : 8 : 3 : 6, this.f32090h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i14 = Integer.parseInt(strExtractMetadata4);
                    int i15 = Integer.parseInt(strExtractMetadata5);
                    if (i15 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.e(i14);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i16 = i14 + 6;
                    int i17 = i15 - 6;
                    if (!Arrays.equals(bArr, f32073e0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i17];
                    gVar.readFully(bArr2);
                    this.f32097p = i16;
                    x(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i18 = Integer.parseInt(strExtractMetadata8);
                    int i19 = Integer.parseInt(strExtractMetadata9);
                    long j9 = i18;
                    gVar.e(j9);
                    byte[] bArr3 = new byte[i19];
                    gVar.readFully(bArr3);
                    this.f32101t = new d(j9, bArr3, 1, i19);
                    this.f32102u = true;
                }
                if (f32078v) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e5) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e5);
            }
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void g(o8.b r22, int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.h.g(o8.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.h.h(java.io.BufferedInputStream):int");
    }

    public final void i(g gVar) throws Throwable {
        int i11;
        int i12;
        l(gVar);
        HashMap[] mapArr = this.f32088f;
        d dVar = (d) mapArr[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f32062d);
            gVar2.f32053c = this.f32090h;
            byte[] bArr = G;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.e(0L);
            byte[] bArr3 = H;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.e(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.e(12L);
            }
            y(gVar2, 6);
            d dVar2 = (d) mapArr[7].get("PreviewImageStart");
            d dVar3 = (d) mapArr[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", dVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = (d) mapArr[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.k(this.f32090h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i13 = iArr[2];
                int i14 = iArr[0];
                if (i13 <= i14 || (i11 = iArr[3]) <= (i12 = iArr[1])) {
                    return;
                }
                int i15 = (i13 - i14) + 1;
                int i16 = (i11 - i12) + 1;
                if (i15 < i16) {
                    int i17 = i15 + i16;
                    i16 = i17 - i16;
                    i15 = i17 - i16;
                }
                d dVarF = d.f(i15, this.f32090h);
                d dVarF2 = d.f(i16, this.f32090h);
                mapArr[0].put("ImageWidth", dVarF);
                mapArr[0].put("ImageLength", dVarF2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        r18.f32102u = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(o8.b r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.h.j(o8.b):void");
    }

    public final void k(b bVar) throws Throwable {
        boolean z11 = f32078v;
        if (z11) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i11 = ByteBuffer.wrap(bArr).getInt();
        int i12 = ByteBuffer.wrap(bArr2).getInt();
        int i13 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i12];
        bVar.a(i11 - bVar.f32052b);
        bVar.readFully(bArr4);
        g(new b(bArr4), i11, 5);
        bVar.a(i13 - bVar.f32052b);
        bVar.f32053c = ByteOrder.BIG_ENDIAN;
        int i14 = bVar.readInt();
        if (z11) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i14);
        }
        for (int i15 = 0; i15 < i14; i15++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == W.f32063a) {
                short s7 = bVar.readShort();
                short s8 = bVar.readShort();
                d dVarF = d.f(s7, this.f32090h);
                d dVarF2 = d.f(s8, this.f32090h);
                HashMap[] mapArr = this.f32088f;
                mapArr[0].put("ImageLength", dVarF);
                mapArr[0].put("ImageWidth", dVarF2);
                if (z11) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s7) + ", width: " + ((int) s8));
                    return;
                }
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void l(g gVar) throws Throwable {
        u(gVar);
        y(gVar, 0);
        H(gVar, 0);
        H(gVar, 5);
        H(gVar, 4);
        I();
        if (this.f32086d == 8) {
            HashMap[] mapArr = this.f32088f;
            d dVar = (d) mapArr[1].get("MakerNote");
            if (dVar != null) {
                g gVar2 = new g(dVar.f32062d);
                gVar2.f32053c = this.f32090h;
                gVar2.a(6);
                y(gVar2, 9);
                d dVar2 = (d) mapArr[9].get("ColorSpace");
                if (dVar2 != null) {
                    mapArr[1].put("ColorSpace", dVar2);
                }
            }
        }
    }

    public final void m(g gVar) throws Throwable {
        if (f32078v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        l(gVar);
        HashMap[] mapArr = this.f32088f;
        d dVar = (d) mapArr[0].get("JpgFromRaw");
        if (dVar != null) {
            g(new b(dVar.f32062d), (int) dVar.f32061c, 5);
        }
        d dVar2 = (d) mapArr[0].get("ISO");
        d dVar3 = (d) mapArr[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", dVar2);
    }

    public final boolean n(g gVar) throws IOException {
        byte[] bArr = f32073e0;
        byte[] bArr2 = new byte[bArr.length];
        gVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrCopyOf = new byte[1024];
        int i11 = 0;
        while (true) {
            if (i11 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            int i12 = gVar.f32051a.read(bArrCopyOf, i11, bArrCopyOf.length - i11);
            if (i12 == -1) {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i11);
                this.f32097p = bArr.length;
                x(0, bArrCopyOf2);
                return true;
            }
            i11 += i12;
            gVar.f32052b += i12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] o() throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = "Error closing fd."
            java.lang.String r1 = "ExifInterfaceUtils"
            java.lang.String r2 = "ExifInterface"
            boolean r3 = r10.f32091i
            r4 = 0
            if (r3 != 0) goto Ld
            goto L9e
        Ld:
            byte[] r3 = r10.f32095n
            if (r3 == 0) goto L12
            return r3
        L12:
            android.content.res.AssetManager$AssetInputStream r3 = r10.f32085c     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            if (r3 == 0) goto L34
            boolean r5 = r3.markSupported()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L26
            if (r5 == 0) goto L2b
            r3.reset()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L26
        L1f:
            r5 = r4
            goto L5d
        L21:
            r2 = move-exception
            r5 = r4
        L23:
            r4 = r3
            goto L9f
        L26:
            r5 = move-exception
            r6 = r5
            r5 = r4
            goto L8c
        L2b:
            java.lang.String r5 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r2, r5)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L26
            a.a.u(r3)
            return r4
        L34:
            java.lang.String r3 = r10.f32083a     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            if (r3 == 0) goto L48
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.lang.String r5 = r10.f32083a     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            goto L1f
        L40:
            r2 = move-exception
            r5 = r4
            goto L9f
        L43:
            r5 = move-exception
            r3 = r4
            r6 = r5
            r5 = r3
            goto L8c
        L48:
            java.io.FileDescriptor r3 = r10.f32084b     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.io.FileDescriptor r3 = android.system.Os.dup(r3)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            int r5 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            r6 = 0
            android.system.Os.lseek(r3, r6, r5)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            r9 = r5
            r5 = r3
            r3 = r9
        L5d:
            o8.b r6 = new o8.b     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            int r7 = r10.l     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            int r8 = r10.f32097p     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            int r7 = r7 + r8
            r6.a(r7)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            int r7 = r10.f32094m     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r6.readFully(r7)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r10.f32095n = r7     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            a.a.u(r3)
            if (r5 == 0) goto L80
            android.system.Os.close(r5)     // Catch: android.system.ErrnoException -> L7c
            return r7
        L7c:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L80:
            return r7
        L81:
            r2 = move-exception
            goto L23
        L83:
            r6 = move-exception
            goto L8c
        L85:
            r2 = move-exception
            r5 = r3
            goto L9f
        L88:
            r5 = move-exception
            r6 = r5
            r5 = r3
            r3 = r4
        L8c:
            java.lang.String r7 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r2, r7, r6)     // Catch: java.lang.Throwable -> L81
            a.a.u(r3)
            if (r5 == 0) goto L9e
            android.system.Os.close(r5)     // Catch: android.system.ErrnoException -> L9a
            goto L9e
        L9a:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L9e:
            return r4
        L9f:
            a.a.u(r4)
            if (r5 == 0) goto Lac
            android.system.Os.close(r5)     // Catch: android.system.ErrnoException -> La8
            goto Lac
        La8:
            r3 = move-exception
            android.util.Log.e(r1, r0, r3)
        Lac:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.h.o():byte[]");
    }

    public final void p(b bVar) throws Throwable {
        if (f32078v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f32053c = ByteOrder.LITTLE_ENDIAN;
        bVar.a(K.length);
        int i11 = bVar.readInt() + 8;
        byte[] bArr = L;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i12 = bVar.readInt();
                int i13 = length + 8;
                if (Arrays.equals(M, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i12];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f32073e0;
                    if (a.a.L(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i12);
                    }
                    this.f32097p = i13;
                    x(0, bArrCopyOfRange);
                    F(new b(bArrCopyOfRange));
                    return;
                }
                if (i12 % 2 == 1) {
                    i12++;
                }
                length = i13 + i12;
                if (length == i11) {
                    return;
                }
                if (length > i11) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i12);
            } catch (EOFException e5) {
                throw new IOException("Encountered corrupt WebP file.", e5);
            }
        }
    }

    public final void r(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get("JPEGInterchangeFormat");
        d dVar2 = (d) map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int i11 = dVar.i(this.f32090h);
        int i12 = dVar2.i(this.f32090h);
        if (this.f32086d == 7) {
            i11 += this.f32098q;
        }
        if (i11 > 0 && i12 > 0) {
            this.f32091i = true;
            if (this.f32083a == null && this.f32085c == null && this.f32084b == null) {
                byte[] bArr = new byte[i12];
                bVar.a(i11);
                bVar.readFully(bArr);
                this.f32095n = bArr;
            }
            this.l = i11;
            this.f32094m = i12;
        }
        if (f32078v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i11 + ", length: " + i12);
        }
    }

    public final boolean s(HashMap map) {
        d dVar = (d) map.get("ImageLength");
        d dVar2 = (d) map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.i(this.f32090h) <= 512 && dVar2.i(this.f32090h) <= 512;
    }

    public final void t(InputStream inputStream) {
        boolean z11 = f32078v;
        for (int i11 = 0; i11 < X.length; i11++) {
            try {
                try {
                    this.f32088f[i11] = new HashMap();
                } finally {
                    a();
                    if (z11) {
                        v();
                    }
                }
            } catch (IOException | UnsupportedOperationException e5) {
                if (z11) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e5);
                }
                a();
                if (z11) {
                    v();
                    return;
                }
                return;
            }
        }
        boolean z12 = this.f32087e;
        if (!z12) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS);
            this.f32086d = h(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i12 = this.f32086d;
        if (i12 == 4 || i12 == 9 || i12 == 13 || i12 == 14) {
            b bVar = new b(inputStream);
            int i13 = this.f32086d;
            if (i13 == 4) {
                g(bVar, 0, 0);
            } else if (i13 == 13) {
                j(bVar);
            } else if (i13 == 9) {
                k(bVar);
            } else if (i13 == 14) {
                p(bVar);
            }
        } else {
            g gVar = new g(inputStream);
            if (!z12) {
                int i14 = this.f32086d;
                if (i14 == 12 || i14 == 15) {
                    f(gVar, i14);
                } else if (i14 == 7) {
                    i(gVar);
                } else if (i14 == 10) {
                    m(gVar);
                } else {
                    l(gVar);
                }
            } else if (!n(gVar)) {
                if (z11) {
                    return;
                } else {
                    return;
                }
            }
            gVar.e(this.f32097p);
            F(gVar);
        }
        a();
        if (z11) {
            v();
        }
    }

    public final void u(g gVar) throws IOException {
        ByteOrder byteOrderW = w(gVar);
        this.f32090h = byteOrderW;
        gVar.f32053c = byteOrderW;
        int unsignedShort = gVar.readUnsignedShort();
        int i11 = this.f32086d;
        if (i11 != 7 && i11 != 10 && unsignedShort != 42) {
            o.o(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i12 = gVar.readInt();
        if (i12 < 8) {
            i4.a.k(s.f(i12, "Invalid first Ifd offset: "));
            return;
        }
        int i13 = i12 - 8;
        if (i13 > 0) {
            gVar.a(i13);
        }
    }

    public final void v() {
        int i11 = 0;
        while (true) {
            HashMap[] mapArr = this.f32088f;
            if (i11 >= mapArr.length) {
                return;
            }
            StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "The size of tag group[", "]: ");
            sbK.append(mapArr[i11].size());
            Log.d("ExifInterface", sbK.toString());
            for (Map.Entry entry : mapArr[i11].entrySet()) {
                d dVar = (d) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.j(this.f32090h) + "'");
            }
            i11++;
        }
    }

    public final void x(int i11, byte[] bArr) throws IOException {
        g gVar = new g(bArr);
        u(gVar);
        y(gVar, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(o8.g r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.h.y(o8.g, int):void");
    }

    public final void z(String str) {
        for (int i11 = 0; i11 < X.length; i11++) {
            this.f32088f[i11].remove(str);
        }
    }

    public h(InputStream inputStream) throws IOException {
        e[][] eVarArr = X;
        this.f32088f = new HashMap[eVarArr.length];
        this.f32089g = new HashSet(eVarArr.length);
        this.f32090h = ByteOrder.BIG_ENDIAN;
        this.f32083a = null;
        this.f32087e = false;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f32085c = (AssetManager.AssetInputStream) inputStream;
            this.f32084b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f32085c = null;
                this.f32084b = fileInputStream.getFD();
            } catch (Exception unused) {
                if (f32078v) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f32085c = null;
                this.f32084b = null;
            }
        } else {
            this.f32085c = null;
            this.f32084b = null;
        }
        t(inputStream);
    }
}
