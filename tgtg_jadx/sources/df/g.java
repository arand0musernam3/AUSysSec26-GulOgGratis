package df;

import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import android.view.View;
import android.view.Window;
import androidx.activity.l;
import b4.x;
import com.google.firebase.messaging.a0;
import gf.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import ye.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f14897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f14898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f14899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f14900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f14901i;

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0224, code lost:
    
        r13.append(r14);
        r13.append(" while using feature groups. If, for example, ");
        r14 = r2[r3.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0232, code lost:
    
        if (r14 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0234, code lost:
    
        if (r14 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0236, code lost:
    
        if (r14 == 3) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0238, code lost:
    
        if (r14 == 4) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x023a, code lost:
    
        if (r14 != 5) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x023c, code lost:
    
        r14 = "UHD recording quality";
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x023f, code lost:
    
        e40.a.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0243, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0244, code lost:
    
        r14 = "JPEG_R output format";
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0247, code lost:
    
        r14 = "stabilization";
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x024a, code lost:
    
        r14 = "60 FPS";
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x024d, code lost:
    
        r14 = "HDR";
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x024f, code lost:
    
        r13.append(r14);
        r13.append(" is required, instead set ");
        r14 = r2[r3.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x025d, code lost:
    
        if (r14 == 1) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x025f, code lost:
    
        if (r14 == 2) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0261, code lost:
    
        if (r14 == 3) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0263, code lost:
    
        if (r14 == 4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0265, code lost:
    
        if (r14 == 5) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0267, code lost:
    
        e40.a.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x026b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x026c, code lost:
    
        r14 = "GroupableFeatures.UHD_RECORDING";
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x026f, code lost:
    
        r14 = "GroupableFeature.IMAGE_ULTRA_HDR";
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0272, code lost:
    
        r14 = "GroupableFeature.PREVIEW_STABILIZATION";
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0275, code lost:
    
        r14 = "GroupableFeature.FPS_60";
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0278, code lost:
    
        r14 = "GroupableFeature.HDR_HLG10";
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x027a, code lost:
    
        i4.a.i(r8.k.p(r13, r14, " as either a required or preferred feature."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0284, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01bd, code lost:
    
        r3 = (p0.b) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01bf, code lost:
    
        if (r3 != null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c1, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c2, code lost:
    
        if (r5 != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c4, code lost:
    
        r13 = new java.lang.StringBuilder("A ");
        r3.getClass();
        r13.append(r3.name());
        r13.append(" value is set to ");
        r13.append(r0);
        r13.append(" despite using feature groups. Do not use APIs like ");
        r2 = m0.z0.$EnumSwitchMapping$0;
        r5 = r2[r3.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ea, code lost:
    
        if (r5 == 1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ec, code lost:
    
        if (r5 == 2) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ee, code lost:
    
        if (r5 == 3) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f0, code lost:
    
        if (r5 == 4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f2, code lost:
    
        if (r5 != 5) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01f4, code lost:
    
        r14 = "Recorder.Builder.setQualitySelector";
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f7, code lost:
    
        e40.a.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01fb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01fc, code lost:
    
        r14 = r0.concat(".Builder.setOutputFormat");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0207, code lost:
    
        if (v0.p.c(r14) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0209, code lost:
    
        r14 = r0.concat(".Builder.setVideoStabilizationEnabled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0210, code lost:
    
        r14 = r0.concat(".Builder.setPreviewStabilizationEnabled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0217, code lost:
    
        r14 = r0.concat(".Builder.setTargetFrameRateRange");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x021e, code lost:
    
        r14 = r0.concat(".Builder.setDynamicRange");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(java.util.ArrayList r13, java.util.List r14) {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df.g.<init>(java.util.ArrayList, java.util.List):void");
    }

    public void a(View view) {
        a0 a0Var;
        Window windowA = h70.g.a(view);
        if (windowA != null) {
            x xVar = new x(10, this, windowA);
            View viewPeekDecorView = windowA.peekDecorView();
            if (viewPeekDecorView != null) {
                xVar.invoke(viewPeekDecorView);
                return;
            }
            synchronized (i70.d.f23491f) {
                try {
                    WeakHashMap weakHashMap = i70.d.f23490e;
                    WeakReference weakReference = (WeakReference) weakHashMap.get(windowA);
                    i70.d dVar = weakReference != null ? (i70.d) weakReference.get() : null;
                    if (dVar != null) {
                        a0Var = dVar.f23493b;
                    } else {
                        Window.Callback callback = windowA.getCallback();
                        if (callback == null) {
                            a0Var = new a0(10);
                        } else {
                            i70.d dVar2 = new i70.d(callback);
                            windowA.setCallback(dVar2);
                            weakHashMap.put(windowA, new WeakReference(dVar2));
                            a0Var = dVar2.f23493b;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ((CopyOnWriteArrayList) a0Var.f12781d).add(new h70.f(a0Var, windowA, xVar));
        }
    }

    public FileInputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e5) {
            String message = e5.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((w9.c) this.f14896d).f();
            return null;
        }
    }

    public void c(int i11, Serializable serializable) {
        ((Executor) this.f14895c).execute(new l(this, i11, serializable, 4));
    }

    public void d(Window window) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f14899g;
        if (linkedHashMap.containsKey(window)) {
            Window.Callback callback = (Window.Callback) linkedHashMap.remove(window);
            if (window.getCallback() instanceof b) {
                if (callback instanceof d) {
                    callback = null;
                }
                window.setCallback(callback);
                ((kf.b) this.f14898f).b("Unwrapped window callback");
            }
        }
    }

    public String toString() {
        switch (this.f14893a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("SessionConfig@");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" {useCases=");
                sb2.append((List) this.f14899g);
                sb2.append(", frameRateRange=");
                sb2.append((Range) this.f14896d);
                sb2.append(", requiredFeatureGroup=");
                sb2.append((Set) this.f14897e);
                sb2.append(", preferredFeatureGroup=");
                sb2.append((List) this.f14898f);
                sb2.append(", effects=");
                return e0.f.p(sb2, (List) this.f14895c, ", viewPort=null}");
            default:
                return super.toString();
        }
    }

    public g(AssetManager assetManager, Executor executor, w9.c cVar, String str, File file) {
        byte[] bArr;
        this.f14893a = 2;
        this.f14894b = false;
        this.f14895c = executor;
        this.f14896d = cVar;
        this.f14899g = str;
        this.f14898f = file;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            bArr = w9.d.f43311d;
        } else {
            switch (i11) {
                case 26:
                    bArr = w9.d.f43314g;
                    break;
                case 27:
                    bArr = w9.d.f43313f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = w9.d.f43312e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.f14897e = bArr;
    }

    public g(h hVar, q qVar, gf.e eVar, kf.b bVar) {
        this.f14893a = 0;
        bVar.getClass();
        this.f14895c = hVar;
        this.f14896d = qVar;
        this.f14897e = eVar;
        this.f14898f = bVar;
        this.f14899g = new LinkedHashMap();
        this.f14900h = new Handler(Looper.getMainLooper());
        this.f14901i = new f(this);
    }
}
