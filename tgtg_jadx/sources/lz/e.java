package lz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GoogleSignInOptions f28439a;

    public e(Context context, Looper looper, com.google.android.gms.common.internal.i iVar, GoogleSignInOptions googleSignInOptions, m mVar, n nVar) {
        kz.b bVar;
        super(context, looper, 91, iVar, mVar, nVar);
        Set<Scope> set = iVar.f11119b;
        if (googleSignInOptions != null) {
            bVar = new kz.b();
            bVar.f26727a = new HashSet();
            bVar.f26734h = new HashMap();
            bVar.f26727a = new HashSet(googleSignInOptions.f11023b);
            bVar.f26728b = googleSignInOptions.f11026e;
            bVar.f26729c = googleSignInOptions.f11027f;
            bVar.f26730d = googleSignInOptions.f11025d;
            bVar.f26731e = googleSignInOptions.f11028g;
            bVar.f26732f = googleSignInOptions.f11024c;
            bVar.f26733g = googleSignInOptions.f11029h;
            bVar.f26734h = GoogleSignInOptions.e(googleSignInOptions.f11030i);
            bVar.f26735i = googleSignInOptions.f11031j;
        } else {
            bVar = new kz.b();
            bVar.f26727a = new HashSet();
            bVar.f26734h = new HashMap();
        }
        bVar.f26735i = f00.f.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = bVar.f26727a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = bVar.f26727a;
        if (hashSet2.contains(GoogleSignInOptions.f11020n)) {
            Scope scope2 = GoogleSignInOptions.f11019m;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (bVar.f26730d && (bVar.f26732f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.l);
        }
        this.f28439a = new GoogleSignInOptions(3, new ArrayList(hashSet2), bVar.f26732f, bVar.f26730d, bVar.f26728b, bVar.f26729c, bVar.f26731e, bVar.f26733g, bVar.f26734h, bVar.f26735i);
    }

    @Override // com.google.android.gms.common.internal.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new j(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 1);
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final Intent getSignInIntent() {
        Context context = getContext();
        h.f28443a.h("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), this.f28439a);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean providesSignIn() {
        return true;
    }
}
