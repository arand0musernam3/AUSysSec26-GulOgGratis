package hi;

import a3.i3;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import androidx.lifecycle.m1;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase;
import bg.w0;
import cj.e0;
import com.app.tgtg.customview.manufactureaddressfragment.XmlCheckoutAddressFragment;
import com.app.tgtg.feature.badges.ui.BadgesActivity;
import com.app.tgtg.feature.login.LoginActivity;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.DiscoverDeliveryTabComposeView;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.DiscoverNotLiveHereView;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.RatingCardComposeView;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.StoreReferralCardComposeView;
import com.app.tgtg.feature.tabprofile.manageaccount.SettingsActivity;
import com.app.tgtg.feature.webview.ui.WebViewActivity;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.braze.Constants;
import com.braze.h2;
import com.braze.requests.framework.f;
import com.braze.requests.o;
import com.google.android.gms.internal.measurement.ib;
import f70.i;
import g3.q9;
import h2.b1;
import hq.l;
import hq.w;
import hq.y;
import hr.n;
import hv.j;
import ia0.d0;
import id.m;
import id.p;
import ja.g;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import jb.s;
import k.h;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mv.a0;
import mv.z;
import o00.x0;
import org.bouncycastle.iana.AEADAlgorithm;
import qb.r;
import td.k;
import v1.u;
import v80.f0;
import zendesk.android.Zendesk;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22068b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f22067a = i11;
        this.f22068b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Exception {
        String str;
        m mVar;
        boolean z11;
        Bitmap bitmapCreateBitmap;
        int i11;
        int iMin;
        double dMax;
        int i12;
        g gVar;
        int I;
        Pair pair;
        Pair pair2;
        UserAddress userAddress;
        String userAddressId;
        int i13 = this.f22067a;
        int i14 = 5;
        int i15 = 4;
        int i16 = 3;
        int i17 = 0;
        x70.c cVar = null;
        Object obj = this.f22068b;
        switch (i13) {
            case 0:
                e eVar = (e) obj;
                eVar.getClass();
                f0.B(m1.d(eVar), null, null, new b1(eVar, null, 1), 3);
                return Unit.f26487a;
            case 1:
                ((hj.d) obj).dismiss();
                return Unit.f26487a;
            case 2:
                int i18 = hq.e.f22355e;
                Context contextD = p70.g.d(((hq.e) obj).getContext());
                contextD.getClass();
                a0 a0Var = new a0();
                z zVar = z.MANUFACTURER;
                zVar.getClass();
                a0Var.f30138a = zVar;
                i iVar = i.DISCOVER_CARD;
                iVar.getClass();
                a0Var.f30139b = iVar;
                a0Var.c((h) contextD);
                return Unit.f26487a;
            case 3:
                Function0 function0 = ((DiscoverDeliveryTabComposeView) obj).f9270j;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f26487a;
            case 4:
                Function0 function02 = ((DiscoverNotLiveHereView) obj).f9274k;
                if (function02 != null) {
                    function02.invoke();
                }
                return Unit.f26487a;
            case 5:
                ((l) obj).f22385f.invoke();
                return Unit.f26487a;
            case 6:
                Function0 function03 = ((RatingCardComposeView) obj).f9280k;
                if (function03 != null) {
                    function03.invoke();
                }
                return Unit.f26487a;
            case 7:
                Runnable runnable = ((w) obj).f22409f;
                if (runnable != null) {
                    runnable.run();
                }
                return Unit.f26487a;
            case 8:
                Function0 function04 = ((StoreReferralCardComposeView) obj).f9283j;
                if (function04 != null) {
                    function04.invoke();
                }
                return Unit.f26487a;
            case 9:
                y yVar = (y) obj;
                int i19 = y.f22416h;
                yVar.getEventTrackingManager().b(cv.i.ACTION_C2B_REFERRAL_CARD_CLICKED);
                Context contextD2 = p70.g.d(yVar.getContext());
                contextD2.getClass();
                h hVar = (h) contextD2;
                Intent intent = new Intent(hVar, (Class<?>) WebViewActivity.class);
                String str2 = yVar.f22417f;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Constants.BRAZE_WEBVIEW_URL_EXTRA);
                    str = null;
                } else {
                    str = str2;
                }
                intent.putExtra("URL", str);
                intent.putExtra("STORE_REFERRAL", true);
                hVar.startActivity(intent, mv.a.b(hVar));
                return Unit.f26487a;
            case 10:
                SettingsActivity settingsActivity = (SettingsActivity) obj;
                int i21 = SettingsActivity.l;
                n nVarA0 = settingsActivity.a0();
                cv.i iVar2 = cv.i.ACTION_LOG_OUT;
                iVar2.getClass();
                cv.b bVar = nVarA0.f22456c;
                bVar.getClass();
                bVar.c(iVar2, null);
                n nVarA02 = settingsActivity.a0();
                f0.B(m1.d(nVarA02), null, null, new b1(nVarA02, cVar, 3), 3);
                settingsActivity.a0().f22459f.f46336a.a(LoginActivity.f9032j);
                return Unit.f26487a;
            case 11:
                j jVar = (j) obj;
                jVar.e();
                hv.g gVar2 = jVar.f22538j;
                if (gVar2 != null) {
                    Zendesk.INSTANCE.getInstance().removeEventListener(gVar2);
                }
                jVar.f22538j = null;
                return Unit.f26487a;
            case 12:
                return com.braze.requests.i.a((o) obj);
            case 13:
                i90.d dVar = (i90.d) obj;
                k90.e eVarO = ox.h.o("kotlinx.serialization.Polymorphic", k90.c.f26212j, new SerialDescriptor[0], new q9(dVar, 27));
                KClass kClass = dVar.f23585a;
                kClass.getClass();
                return new k90.b(eVarO, kClass);
            case 14:
                return ((Worker) obj).d();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                id.e eVar2 = (id.e) obj;
                BitmapFactory.Options options = new BitmapFactory.Options();
                td.o oVar = eVar2.f23787b;
                id.b bVar2 = new id.b(eVar2.f23786a.p0(), i17);
                d0 d0Var = new d0(bVar2);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new ib(d0Var.g(), i16), null, options);
                Exception exc = bVar2.f23780c;
                if (exc != null) {
                    throw exc;
                }
                options.inJustDecodeBounds = false;
                Paint paint = p.f23801a;
                String str3 = options.outMimeType;
                eVar2.f23789d.getClass();
                if (str3 != null && (Intrinsics.areEqual(str3, "image/jpeg") || Intrinsics.areEqual(str3, "image/webp") || Intrinsics.areEqual(str3, "image/heic") || Intrinsics.areEqual(str3, "image/heif"))) {
                    o8.h hVar2 = new o8.h(new id.n(new ib(d0Var.g(), i16), 0));
                    int iD = hVar2.d(1, "Orientation");
                    boolean z12 = iD == 2 || iD == 7 || iD == 4 || iD == 5;
                    switch (hVar2.d(1, "Orientation")) {
                        case 3:
                        case 4:
                            i12 = 180;
                            break;
                        case 5:
                        case 8:
                            i12 = 270;
                            break;
                        case 6:
                        case 7:
                            i12 = 90;
                            break;
                        default:
                            i12 = 0;
                            break;
                    }
                    mVar = new m(z12, i12);
                } else {
                    mVar = m.f23794c;
                }
                int i22 = mVar.f23796b;
                boolean z13 = mVar.f23795a;
                Exception exc2 = bVar2.f23780c;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inMutable = false;
                fd.j jVar2 = k.f40022c;
                ColorSpace colorSpace = (ColorSpace) fd.o.f(oVar, jVar2);
                Context context = oVar.f40030a;
                if (colorSpace != null) {
                    options.inPreferredColorSpace = (ColorSpace) fd.o.f(oVar, jVar2);
                }
                options.inPremultiplied = ((Boolean) fd.o.f(oVar, k.f40023d)).booleanValue();
                Bitmap.Config config = (Bitmap.Config) fd.o.f(oVar, k.f40021b);
                if ((z13 || i22 > 0) && (config == null || config == Bitmap.Config.HARDWARE)) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (((Boolean) fd.o.f(oVar, k.f40026g)).booleanValue() && config == Bitmap.Config.ARGB_8888 && Intrinsics.areEqual(options.outMimeType, "image/jpeg")) {
                    config = Bitmap.Config.RGB_565;
                }
                Bitmap.Config config2 = options.outConfig;
                Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                    config = config3;
                }
                options.inPreferredConfig = config;
                int i23 = options.outWidth;
                try {
                    if (i23 <= 0 || (i11 = options.outHeight) <= 0) {
                        z11 = z13;
                        options.inSampleSize = 1;
                        options.inScaled = false;
                    } else {
                        int i24 = (i22 == 90 || i22 == 270) ? i11 : i23;
                        if (i22 != 90 && i22 != 270) {
                            i23 = i11;
                        }
                        ud.h hVar3 = oVar.f40031b;
                        ud.g gVar3 = oVar.f40032c;
                        fd.j jVar3 = td.j.f40017b;
                        long jU = m0.c.U(i24, i23, hVar3, gVar3, (ud.h) fd.o.f(oVar, jVar3));
                        int i25 = (int) (jU >> 32);
                        int i26 = (int) (jU & 4294967295L);
                        int iHighestOneBit = Integer.highestOneBit(i24 / i25);
                        int iHighestOneBit2 = Integer.highestOneBit(i23 / i26);
                        int[] iArr = id.j.$EnumSwitchMapping$0;
                        int i27 = iArr[gVar3.ordinal()];
                        if (i27 == 1) {
                            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                        } else {
                            if (i27 != 2) {
                                e40.a.f();
                                return null;
                            }
                            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                        }
                        if (iMin < 1) {
                            iMin = 1;
                        }
                        options.inSampleSize = iMin;
                        z11 = z13;
                        double d3 = iMin;
                        double d11 = ((double) i24) / d3;
                        double d12 = ((double) i23) / d3;
                        ud.h hVar4 = (ud.h) fd.o.f(oVar, jVar3);
                        double d13 = ((double) i25) / d11;
                        double d14 = ((double) i26) / d12;
                        int i28 = iArr[gVar3.ordinal()];
                        if (i28 == 1) {
                            dMax = Math.max(d13, d14);
                        } else {
                            if (i28 != 2) {
                                e40.a.f();
                                return null;
                            }
                            dMax = Math.min(d13, d14);
                        }
                        ud.c cVar2 = hVar4.f41060a;
                        if (cVar2 instanceof ud.a) {
                            double d15 = ((double) ((ud.a) cVar2).f41055a) / d11;
                            if (dMax > d15) {
                                dMax = d15;
                            }
                        }
                        ud.c cVar3 = hVar4.f41061b;
                        if (cVar3 instanceof ud.a) {
                            double d16 = ((double) ((ud.a) cVar3).f41055a) / d12;
                            if (dMax > d16) {
                                dMax = d16;
                            }
                        }
                        if (oVar.f40033d == ud.d.INEXACT && dMax > 1.0d) {
                            dMax = 1.0d;
                        }
                        boolean z14 = dMax == 1.0d;
                        options.inScaled = !z14;
                        if (!z14) {
                            if (dMax > 1.0d) {
                                options.inDensity = j80.c.a(((double) Integer.MAX_VALUE) / dMax);
                                options.inTargetDensity = Integer.MAX_VALUE;
                            } else {
                                options.inDensity = Integer.MAX_VALUE;
                                options.inTargetDensity = j80.c.a(((double) Integer.MAX_VALUE) * dMax);
                            }
                        }
                    }
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new ib(d0Var, 3), null, options);
                    d0Var.close();
                    Exception exc3 = bVar2.f23780c;
                    if (exc3 != null) {
                        throw exc3;
                    }
                    if (bitmapDecodeStream == null) {
                        h2.b("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        return null;
                    }
                    bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                    if (z11 || i22 > 0) {
                        Matrix matrix = new Matrix();
                        float width = bitmapDecodeStream.getWidth() / 2.0f;
                        float height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z11) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i22 > 0) {
                            matrix.postRotate(i22, width, height);
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        float f11 = rectF.left;
                        if (f11 != 0.0f || rectF.top != 0.0f) {
                            matrix.postTranslate(-f11, -rectF.top);
                        }
                        if (i22 == 90 || i22 == 270) {
                            int height2 = bitmapDecodeStream.getHeight();
                            int width2 = bitmapDecodeStream.getWidth();
                            Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                        } else {
                            int width3 = bitmapDecodeStream.getWidth();
                            int height3 = bitmapDecodeStream.getHeight();
                            Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                            if (config5 == null) {
                                config5 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                        }
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, p.f23801a);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    }
                    return new id.i(fd.o.c(new BitmapDrawable(context.getResources(), bitmapDecodeStream)), options.inSampleSize > 1 || options.inScaled);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        u00.d.p(d0Var, th2);
                        throw th3;
                    }
                }
            case 16:
                int i29 = BadgesActivity.f8964i;
                ((BadgesActivity) obj).getOnBackPressedDispatcher().d();
                return Unit.f26487a;
            case 17:
                ((u) obj).a(false);
                return Unit.f26487a;
            case 18:
                return com.braze.requests.framework.b.a((com.braze.requests.framework.h) obj);
            case 19:
                return com.braze.requests.framework.e.a((com.braze.requests.framework.g) obj);
            case 20:
                return f.b((com.braze.models.response.a) obj);
            case 21:
                ((m1.c) obj).c();
                return Unit.f26487a;
            case 22:
                return (h4.c) obj;
            case 23:
                ja.h hVar5 = (ja.h) obj;
                String str4 = hVar5.f24784b;
                if (str4 == null || !hVar5.f24786d) {
                    gVar = new g(hVar5.f24783a, hVar5.f24784b, new lz.i(24), hVar5.f24785c, hVar5.f24787e);
                } else {
                    Context context2 = hVar5.f24783a;
                    context2.getClass();
                    File noBackupFilesDir = context2.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    gVar = new g(hVar5.f24783a, new File(noBackupFilesDir, str4).getAbsolutePath(), new lz.i(24), hVar5.f24785c, hVar5.f24787e);
                }
                gVar.setWriteAheadLoggingEnabled(hVar5.f24789g);
                return gVar;
            case 24:
                ja0.j jVar4 = (ja0.j) obj;
                ClassLoader classLoader = jVar4.f24813c;
                ia0.m mVar2 = jVar4.f24814d;
                Enumeration<URL> resources = classLoader.getResources("");
                resources.getClass();
                ArrayList<URL> list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    url.getClass();
                    if (Intrinsics.areEqual(url.getProtocol(), "file")) {
                        String str5 = ia0.a0.f23602b;
                        pair2 = new Pair(mVar2, n20.f.t(new File(url.toURI())));
                    } else {
                        pair2 = null;
                    }
                    if (pair2 != null) {
                        arrayList.add(pair2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList<URL> list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (URL url2 : list2) {
                    url2.getClass();
                    String string = url2.toString();
                    string.getClass();
                    if (kotlin.text.y.p(string, "jar:file:", false) && (I = StringsKt.I(6, string, "!")) != -1) {
                        String str6 = ia0.a0.f23602b;
                        pair = new Pair(ja0.o.c(n20.f.t(new File(URI.create(string.substring(4, I)))), mVar2, new im.a(i15)), ja0.j.f24812f);
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                return CollectionsKt.d0(arrayList2, arrayList);
            case 25:
                rb.b.a((jb.o) obj);
                return Unit.f26487a;
            case 26:
                s sVar = (s) obj;
                WorkDatabase workDatabase = sVar.f24926c;
                Context context3 = sVar.f24924a;
                String str7 = lb.d.f27580f;
                if (Build.VERSION.SDK_INT >= 34) {
                    lb.a.b(context3).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context3.getSystemService("jobscheduler");
                ArrayList arrayListE = lb.d.e(context3, jobScheduler);
                if (arrayListE != null && !arrayListE.isEmpty()) {
                    Iterator it = arrayListE.iterator();
                    while (it.hasNext()) {
                        lb.d.c(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                ((Number) x0.A(workDatabase.x().f36870a, false, true, new r(i14))).intValue();
                jb.j.b(sVar.f24925b, workDatabase, sVar.f24928e);
                return Unit.f26487a;
            case 27:
                i3 i3Var = (i3) obj;
                if (!i3Var.f394a) {
                    ((e0) i3Var.f396c).m(cv.i.ACTION_INITIATE_ADDRESS_SEARCH);
                    i3Var.f394a = true;
                }
                return Unit.f26487a;
            case 28:
                jg.a0 a0Var2 = (jg.a0) obj;
                List list3 = a0Var2.f25149e;
                e0 e0Var = a0Var2.f25146b;
                if (list3 != null && (userAddress = (UserAddress) list3.get(0)) != null && (userAddressId = userAddress.getUserAddressId()) != null) {
                    if (e0Var.T != null) {
                        XmlCheckoutAddressFragment xmlCheckoutAddressFragment = a0Var2.f25148d;
                        w0 w0VarZ = xmlCheckoutAddressFragment.z();
                        pg.r rVar = xmlCheckoutAddressFragment.f8936k;
                        if (rVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            rVar = null;
                        }
                        w0VarZ.b(rVar.f35089a);
                    }
                    f0.B(m1.d(e0Var), null, null, new cj.s(e0Var, userAddressId, null), 3);
                }
                return Unit.f26487a;
            default:
                ((jq.b) obj).f25365g.invoke();
                return Unit.f26487a;
        }
    }
}
