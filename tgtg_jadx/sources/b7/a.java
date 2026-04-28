package b7;

import android.app.job.JobParameters;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.location.Location;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.LongSparseArray;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.View;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.work.impl.background.systemjob.SystemJobService;
import d4.e;
import h7.a0;
import j4.s;
import j5.m;
import j5.t;
import j5.u;
import j5.w;
import j5.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.text.y;
import org.bouncycastle.iana.AEADAlgorithm;
import s0.h;
import s0.i;
import s0.j;
import xz.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(e eVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        u uVar;
        t tVar;
        j5.a aVar;
        Function1 function1;
        int size = longSparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            long jKeyAt = longSparseArray.keyAt(i11);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (uVar = (u) eVar.d().b((int) jKeyAt)) != null && (tVar = uVar.f24700a) != null && (aVar = (j5.a) w.d(tVar.f24696d, m.l)) != null && (function1 = (Function1) aVar.f24610b) != null) {
            }
        }
    }

    public static void b(Canvas canvas, int[] iArr, int i11, float[] fArr, int i12, int i13, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i11, fArr, i12, i13, font, paint);
    }

    public static void c(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static void d(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static i e(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new h(audioProfile.getMediaType(), audioProfile.getCodec(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new j(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return i.a(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static EncoderProfiles f(int i11, String str) {
        return CamcorderProfile.getAll(str, i11);
    }

    public static Path g(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static a0 h(Display display, int i11) {
        RoundedCorner roundedCorner;
        int i12;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i11)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i12 = 1;
            if (position != 1) {
                i12 = 2;
                if (position != 2) {
                    i12 = 3;
                    if (position != 3) {
                        i4.a.f(s.f(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i12 = 0;
        }
        return new a0(i12, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static int i(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.f4160e;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return stopReason;
            default:
                return -512;
        }
    }

    public static boolean j(String str) {
        String str2 = Build.MANUFACTURER;
        str2.getClass();
        if (str2.equalsIgnoreCase(str)) {
            return true;
        }
        String str3 = Build.BRAND;
        str3.getClass();
        return str3.equalsIgnoreCase(str);
    }

    public static boolean k(Location location) {
        return location.isMock();
    }

    public static boolean l() {
        if (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            return true;
        }
        String str = Build.HARDWARE;
        str.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        if (y.p(lowerCase, "ums", false)) {
            return true;
        }
        if (j("Itel")) {
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            if (y.p(lowerCase2, "sp", false)) {
                return true;
            }
        }
        return false;
    }

    public static Typeface m(Configuration configuration, Typeface typeface) {
        int i11;
        if (Build.VERSION.SDK_INT < 31 || (i11 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i11 == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, b.o(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    public static void n(e eVar, long[] jArr, Consumer consumer) {
        t tVar;
        for (long j9 : jArr) {
            u uVar = (u) eVar.d().b((int) j9);
            if (uVar != null && (tVar = uVar.f24700a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(eVar.f14032a.getAutofillId(), tVar.f24699g);
                List list = (List) w.d(tVar.f24696d, x.B);
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new m5.h(b6.b.a(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static void o(RenderNode renderNode) {
        renderNode.setRenderEffect(null);
    }

    public static void p(View view) {
        view.setRenderEffect(null);
    }
}
