package cy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.FacebookException;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends c0 {

    @NotNull
    public static final Parcelable.Creator<n> CREATOR = new b(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f13548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13549d;

    public n(u uVar) {
        this.f13491b = uVar;
        this.f13549d = "get_token";
    }

    @Override // cy.c0
    public final void b() {
        m mVar = this.f13548c;
        if (mVar != null) {
            mVar.f13540d = false;
            mVar.f13539c = null;
            this.f13548c = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // cy.c0
    public final String e() {
        return this.f13549d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c A[Catch: all -> 0x0089, TRY_ENTER, TryCatch #1 {, blocks: (B:8:0x001a, B:13:0x0023, B:25:0x004c, B:28:0x0056, B:19:0x0043, B:16:0x0033), top: B:48:0x001a, inners: #0 }] */
    @Override // cy.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(cy.r r8) {
        /*
            r7 = this;
            r8.getClass()
            cy.m r0 = new cy.m
            cy.u r1 = r7.d()
            androidx.fragment.app.o0 r1 = r1.e()
            if (r1 == 0) goto L10
            goto L14
        L10:
            android.content.Context r1 = ax.a0.a()
        L14:
            r0.<init>(r1, r8)
            r7.f13548c = r0
            monitor-enter(r0)
            boolean r1 = r0.f13540d     // Catch: java.lang.Throwable -> L89
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L23
            monitor-exit(r0)
        L21:
            r1 = r2
            goto L5f
        L23:
            int r1 = r0.f13546j     // Catch: java.lang.Throwable -> L89
            tx.h0 r4 = tx.h0.f40515a     // Catch: java.lang.Throwable -> L89
            java.lang.Class<tx.h0> r4 = tx.h0.class
            java.util.Set r5 = yx.a.f46339a     // Catch: java.lang.Throwable -> L89
            boolean r5 = r5.contains(r4)     // Catch: java.lang.Throwable -> L89
            if (r5 == 0) goto L33
        L31:
            r1 = r2
            goto L47
        L33:
            tx.h0 r5 = tx.h0.f40515a     // Catch: java.lang.Throwable -> L42
            java.util.ArrayList r6 = tx.h0.f40516b     // Catch: java.lang.Throwable -> L42
            int[] r1 = new int[]{r1}     // Catch: java.lang.Throwable -> L42
            e10.t r1 = r5.g(r6, r1)     // Catch: java.lang.Throwable -> L42
            int r1 = r1.f15548a     // Catch: java.lang.Throwable -> L42
            goto L47
        L42:
            r1 = move-exception
            yx.a.a(r4, r1)     // Catch: java.lang.Throwable -> L89
            goto L31
        L47:
            r4 = -1
            if (r1 != r4) goto L4c
            monitor-exit(r0)
            goto L21
        L4c:
            android.content.Context r1 = r0.f13537a     // Catch: java.lang.Throwable -> L89
            android.content.Intent r1 = tx.h0.d(r1)     // Catch: java.lang.Throwable -> L89
            if (r1 != 0) goto L56
            r1 = r2
            goto L5e
        L56:
            r0.f13540d = r3     // Catch: java.lang.Throwable -> L89
            android.content.Context r4 = r0.f13537a     // Catch: java.lang.Throwable -> L89
            r4.bindService(r1, r0, r3)     // Catch: java.lang.Throwable -> L89
            r1 = r3
        L5e:
            monitor-exit(r0)
        L5f:
            if (r1 != 0) goto L62
            return r2
        L62:
            cy.u r0 = r7.d()
            se.b r0 = r0.f13584e
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r0.f39010b
            cy.v r0 = (cy.v) r0
            android.view.View r0 = r0.f13595e
            if (r0 != 0) goto L78
            java.lang.String r0 = "progressBar"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
        L78:
            r0.setVisibility(r2)
        L7b:
            a50.d r0 = new a50.d
            r1 = 8
            r0.<init>(r1, r7, r8)
            cy.m r8 = r7.f13548c
            if (r8 == 0) goto L88
            r8.f13539c = r0
        L88:
            return r3
        L89:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cy.n.k(cy.r):int");
    }

    public final void l(Bundle bundle, r rVar) {
        t tVar;
        ax.l lVar;
        rVar.getClass();
        bundle.getClass();
        try {
            ax.b bVarM = b0.a0.m(bundle, ax.k.FACEBOOK_APPLICATION_SERVICE, rVar.f13556d);
            String str = rVar.f13568q;
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                lVar = null;
            } else {
                try {
                    lVar = new ax.l(string, str);
                } catch (Exception e5) {
                    throw new FacebookException(e5.getMessage());
                }
            }
            tVar = new t(rVar, s.SUCCESS, bVarM, lVar, null, null);
        } catch (FacebookException e11) {
            r rVar2 = d().f13586g;
            String message = e11.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            tVar = new t(rVar2, s.ERROR, null, TextUtils.join(": ", arrayList), null);
        }
        d().d(tVar);
    }

    public n(Parcel parcel) {
        super(parcel);
        this.f13549d = "get_token";
    }
}
