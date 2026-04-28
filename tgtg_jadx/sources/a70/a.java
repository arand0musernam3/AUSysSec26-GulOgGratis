package a70;

import android.app.Activity;
import android.content.Intent;
import android.graphics.text.LineBreakConfig;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.media.EncoderProfiles;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.window.OnBackInvokedDispatcher;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import d6.g0;
import e0.v;
import f0.t0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import ky.o;
import m0.c0;
import r8.k;
import s0.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static i10.c a(Bundle bundle) throws GoogleIdTokenParsingException {
        bundle.getClass();
        try {
            String string = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            String string6 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            string.getClass();
            string2.getClass();
            return new i10.c(string, string2, string3, string4, string5, uri, string6);
        } catch (Exception e5) {
            throw new GoogleIdTokenParsingException(e5);
        }
    }

    public static s0.i b(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new s0.h(audioProfile.getMediaType(), audioProfile.getCodec(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new j(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
        }
        return s0.i.a(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static o c(v vVar) {
        vVar.getClass();
        int i11 = Build.VERSION.SDK_INT;
        o oVar = null;
        if (i11 >= 33) {
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
            key.getClass();
            DynamicRangeProfiles dynamicRangeProfiles = (DynamicRangeProfiles) ((t0) vVar).c(key);
            if (dynamicRangeProfiles != null) {
                if (i11 < 33) {
                    e40.a.g(k.h(i11, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher. is not supported on API ", " (requires API 33)"));
                    return null;
                }
                oVar = new o(new x.c(dynamicRangeProfiles), 29);
            }
        }
        return oVar == null ? x.d.f43601a : oVar;
    }

    public static final Serializable d(Intent intent) {
        intent.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            return intent.getSerializableExtra("DESTINATION", ek.b.class);
        }
        Serializable serializableExtra = intent.getSerializableExtra("DESTINATION");
        if (serializableExtra != null) {
            return serializableExtra;
        }
        return null;
    }

    public static int e() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 33 && (i11 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) {
            return Integer.MAX_VALUE;
        }
        return MediaStore.getPickImagesMaxLimit();
    }

    public static Object f(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    public static ArrayList g(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static Object h(Intent intent, String str, Class cls) {
        return intent.getParcelableExtra(str, cls);
    }

    public static c0 i(v vVar) {
        vVar.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE;
        key.getClass();
        Long l = (Long) ((t0) vVar).c(key);
        if (l != null) {
            return (c0) c0.a.f6788a.get(l);
        }
        return null;
    }

    public static Serializable j(Bundle bundle) {
        return bundle.getSerializable("ORIGIN", f70.i.class);
    }

    public static String k(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static final BoringLayout.Metrics l(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static final boolean m(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static final boolean n(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static boolean o(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void p(g0 g0Var, d6.v vVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (vVar == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = g0Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, vVar);
    }

    public static final void q(g0 g0Var, d6.v vVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (vVar == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = g0Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(vVar);
    }

    public static final void r(CursorAnchorInfo.Builder builder, h4.c cVar) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(i4.g0.A(cVar)).setHandwritingBounds(i4.g0.A(cVar)).build());
    }

    public static final void s(StaticLayout.Builder builder, int i11, int i12) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i11).setLineBreakWordStyle(i12).build());
    }

    public static final void t(Activity activity, long j9) {
        activity.getClass();
        int iC = i4.g0.C(j9);
        activity.getWindow().setStatusBarColor(iC);
        new WindowInsetsControllerCompat(activity.getWindow(), activity.getWindow().getDecorView()).d(x6.c.b(iC) > 0.5d);
    }
}
