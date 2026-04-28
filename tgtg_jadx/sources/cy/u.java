package cy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.o0;
import com.app.tgtg.R;
import com.facebook.CustomTabMainActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import tx.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<u> CREATOR = new b(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0[] f13580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f13582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w.z f13583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public se.b f13584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r f13586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map f13587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinkedHashMap f13588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f13589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13590k;
    public int l;

    public final void a(String str, String str2, boolean z11) {
        Map map = this.f13587h;
        if (map == null) {
            map = new HashMap();
        }
        if (this.f13587h == null) {
            this.f13587h = map;
        }
        if (map.containsKey(str) && z11) {
            str2 = ((String) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final boolean b() {
        if (this.f13585f) {
            return true;
        }
        o0 o0VarE = e();
        if ((o0VarE != null ? o0VarE.checkCallingOrSelfPermission("android.permission.INTERNET") : -1) == 0) {
            this.f13585f = true;
            return true;
        }
        o0 o0VarE2 = e();
        String string = o0VarE2 != null ? o0VarE2.getString(R.string.com_facebook_internet_permission_error_title) : null;
        String string2 = o0VarE2 != null ? o0VarE2.getString(R.string.com_facebook_internet_permission_error_message) : null;
        r rVar = this.f13586g;
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            arrayList.add(string);
        }
        if (string2 != null) {
            arrayList.add(string2);
        }
        c(new t(rVar, s.ERROR, null, TextUtils.join(": ", arrayList), null));
        return false;
    }

    public final void c(t tVar) {
        u uVar;
        tVar.getClass();
        s sVar = tVar.f13572a;
        c0 c0VarF = f();
        if (c0VarF != null) {
            uVar = this;
            uVar.h(c0VarF.e(), c0VarF.f13490a, sVar.a(), tVar.f13575d, tVar.f13576e);
        } else {
            uVar = this;
        }
        Map map = uVar.f13587h;
        if (map != null) {
            tVar.f13578g = map;
        }
        LinkedHashMap linkedHashMap = uVar.f13588i;
        if (linkedHashMap != null) {
            tVar.f13579h = linkedHashMap;
        }
        uVar.f13580a = null;
        uVar.f13581b = -1;
        uVar.f13586g = null;
        uVar.f13587h = null;
        uVar.f13590k = 0;
        uVar.l = 0;
        w.z zVar = uVar.f13583d;
        if (zVar != null) {
            v vVar = (v) zVar.f42799b;
            vVar.f13592b = null;
            int i11 = sVar == s.CANCEL ? 0 : -1;
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", tVar);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            o0 activity = vVar.getActivity();
            if (!vVar.isAdded() || activity == null) {
                return;
            }
            activity.setResult(i11, intent);
            activity.finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:9:0x0019, B:11:0x0023, B:15:0x004f, B:14:0x0036), top: B:26:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(cy.t r11) {
        /*
            r10 = this;
            r11.getClass()
            ax.b r0 = r11.f13573b
            if (r0 == 0) goto L81
            java.util.Date r1 = ax.b.l
            boolean r1 = pd.g.B()
            if (r1 == 0) goto L81
            if (r0 == 0) goto L79
            ax.b r1 = pd.g.v()
            java.lang.String r2 = ": "
            if (r1 == 0) goto L36
            java.lang.String r1 = r1.f4879i     // Catch: java.lang.Exception -> L33
            java.lang.String r0 = r0.f4879i     // Catch: java.lang.Exception -> L33
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)     // Catch: java.lang.Exception -> L33
            if (r0 == 0) goto L36
            cy.r r4 = r10.f13586g     // Catch: java.lang.Exception -> L33
            ax.b r6 = r11.f13573b     // Catch: java.lang.Exception -> L33
            ax.l r7 = r11.f13574c     // Catch: java.lang.Exception -> L33
            cy.t r3 = new cy.t     // Catch: java.lang.Exception -> L33
            cy.s r5 = cy.s.SUCCESS     // Catch: java.lang.Exception -> L33
            r8 = 0
            r9 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L33
            goto L4f
        L33:
            r0 = move-exception
            r11 = r0
            goto L53
        L36:
            cy.r r4 = r10.f13586g     // Catch: java.lang.Exception -> L33
            java.lang.String r11 = "User logged in as different Facebook user."
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L33
            r0.<init>()     // Catch: java.lang.Exception -> L33
            r0.add(r11)     // Catch: java.lang.Exception -> L33
            java.lang.String r7 = android.text.TextUtils.join(r2, r0)     // Catch: java.lang.Exception -> L33
            cy.t r3 = new cy.t     // Catch: java.lang.Exception -> L33
            cy.s r5 = cy.s.ERROR     // Catch: java.lang.Exception -> L33
            r6 = 0
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L33
        L4f:
            r10.c(r3)     // Catch: java.lang.Exception -> L33
            return
        L53:
            cy.r r4 = r10.f13586g
            java.lang.String r11 = r11.getMessage()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "Caught exception"
            r0.add(r1)
            if (r11 == 0) goto L68
            r0.add(r11)
        L68:
            java.lang.String r7 = android.text.TextUtils.join(r2, r0)
            cy.t r3 = new cy.t
            cy.s r5 = cy.s.ERROR
            r6 = 0
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            r10.c(r3)
            return
        L79:
            com.facebook.FacebookException r11 = new com.facebook.FacebookException
            java.lang.String r0 = "Can't validate without a token"
            r11.<init>(r0)
            throw r11
        L81:
            r10.c(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cy.u.d(cy.t):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final o0 e() {
        v vVar = this.f13582c;
        if (vVar != null) {
            return vVar.getActivity();
        }
        return null;
    }

    public final c0 f() {
        c0[] c0VarArr;
        int i11 = this.f13581b;
        if (i11 < 0 || (c0VarArr = this.f13580a) == null) {
            return null;
        }
        return c0VarArr[i11];
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cy.w g() {
        /*
            r4 = this;
            cy.w r0 = r4.f13589j
            if (r0 == 0) goto L23
            java.util.Set r1 = yx.a.f46339a
            boolean r1 = r1.contains(r0)
            r2 = 0
            if (r1 == 0) goto Lf
        Ld:
            r1 = r2
            goto L17
        Lf:
            java.lang.String r1 = r0.f13597a     // Catch: java.lang.Throwable -> L12
            goto L17
        L12:
            r1 = move-exception
            yx.a.a(r0, r1)
            goto Ld
        L17:
            cy.r r3 = r4.f13586g
            if (r3 == 0) goto L1d
            java.lang.String r2 = r3.f13556d
        L1d:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L41
        L23:
            cy.w r0 = new cy.w
            androidx.fragment.app.o0 r1 = r4.e()
            if (r1 == 0) goto L2c
            goto L30
        L2c:
            android.content.Context r1 = ax.a0.a()
        L30:
            cy.r r2 = r4.f13586g
            if (r2 == 0) goto L38
            java.lang.String r2 = r2.f13556d
            if (r2 != 0) goto L3c
        L38:
            java.lang.String r2 = ax.a0.b()
        L3c:
            r0.<init>(r1, r2)
            r4.f13589j = r0
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cy.u.g():cy.w");
    }

    public final void h(String str, Map map, String str2, String str3, String str4) {
        r rVar = this.f13586g;
        if (rVar == null) {
            g().a("fb_mobile_login_method_complete", str);
            return;
        }
        w wVarG = g();
        String str5 = rVar.f13559g;
        String str6 = rVar.f13566o ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete";
        if (yx.a.f46339a.contains(wVarG)) {
            return;
        }
        try {
            ScheduledExecutorService scheduledExecutorService = w.f13596d;
            Bundle bundleB = a0.b(str5);
            if (str2 != null) {
                bundleB.putString("2_result", str2);
            }
            if (str3 != null) {
                bundleB.putString("5_error_message", str3);
            }
            if (str4 != null) {
                bundleB.putString("4_error_code", str4);
            }
            if (map != null && !map.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()) != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                bundleB.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            bundleB.putString("3_method", str);
            wVarG.f13598b.M(bundleB, str6);
        } catch (Throwable th2) {
            yx.a.a(wVarG, th2);
        }
    }

    public final void i(int i11, int i12, Intent intent) {
        this.f13590k++;
        if (this.f13586g != null) {
            if (intent != null) {
                int i13 = CustomTabMainActivity.f10978c;
                if (intent.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false)) {
                    j();
                    return;
                }
            }
            c0 c0VarF = f();
            if (c0VarF != null) {
                if ((c0VarF instanceof p) && intent == null && this.f13590k < this.l) {
                    return;
                }
                c0VarF.h(i11, i12, intent);
            }
        }
    }

    public final void j() {
        u uVar;
        c0 c0VarF = f();
        if (c0VarF != null) {
            uVar = this;
            uVar.h(c0VarF.e(), c0VarF.f13490a, "skipped", null, null);
        } else {
            uVar = this;
        }
        c0[] c0VarArr = uVar.f13580a;
        while (c0VarArr != null) {
            int i11 = uVar.f13581b;
            if (i11 >= c0VarArr.length - 1) {
                break;
            }
            uVar.f13581b = i11 + 1;
            c0 c0VarF2 = f();
            if (c0VarF2 != null) {
                if (!(c0VarF2 instanceof l0) || b()) {
                    r rVar = uVar.f13586g;
                    if (rVar == null) {
                        continue;
                    } else {
                        int iK = c0VarF2.k(rVar);
                        uVar.f13590k = 0;
                        if (iK > 0) {
                            w wVarG = g();
                            String str = rVar.f13559g;
                            String strE = c0VarF2.e();
                            String str2 = rVar.f13566o ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start";
                            if (!yx.a.f46339a.contains(wVarG)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService = w.f13596d;
                                    Bundle bundleB = a0.b(str);
                                    bundleB.putString("3_method", strE);
                                    wVarG.f13598b.M(bundleB, str2);
                                } catch (Throwable th2) {
                                    yx.a.a(wVarG, th2);
                                }
                            }
                            uVar.l = iK;
                        } else {
                            w wVarG2 = g();
                            String str3 = rVar.f13559g;
                            String strE2 = c0VarF2.e();
                            String str4 = rVar.f13566o ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried";
                            if (!yx.a.f46339a.contains(wVarG2)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService2 = w.f13596d;
                                    Bundle bundleB2 = a0.b(str3);
                                    bundleB2.putString("3_method", strE2);
                                    wVarG2.f13598b.M(bundleB2, str4);
                                } catch (Throwable th3) {
                                    yx.a.a(wVarG2, th3);
                                }
                            }
                            a("not_tried", c0VarF2.e(), true);
                        }
                        if (iK > 0) {
                            return;
                        }
                    }
                } else {
                    a("no_internet_permission", "1", false);
                }
            }
        }
        r rVar2 = uVar.f13586g;
        if (rVar2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Login attempt failed.");
            c(new t(rVar2, s.ERROR, null, TextUtils.join(": ", arrayList), null));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeParcelableArray(this.f13580a, i11);
        parcel.writeInt(this.f13581b);
        parcel.writeParcelable(this.f13586g, i11);
        n0.I(parcel, this.f13587h);
        n0.I(parcel, this.f13588i);
    }
}
