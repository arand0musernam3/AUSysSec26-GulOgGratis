package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.braze.h2;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l extends f implements com.google.android.gms.common.api.f {
    private static volatile Executor zaa;
    private final i zab;
    private final Set zac;
    private final Account zad;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(Context context, Looper looper, int i11, i iVar, qz.f fVar, qz.n nVar) {
        t0 t0VarA = m.a(context);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.f11044d;
        i0.h(fVar);
        i0.h(nVar);
        super(context, looper, t0VarA, googleApiAvailability, i11, new r(fVar), new r(nVar), iVar.f11121d);
        this.zab = iVar;
        this.zad = null;
        Set<Scope> set = iVar.f11119b;
        Set<Scope> setValidateScopes = validateScopes(set);
        Iterator<Scope> it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                h2.b("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.zac = setValidateScopes;
    }

    public static void zag(Executor executor) {
        zaa = executor;
    }

    @Override // com.google.android.gms.common.internal.f
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.f
    public Executor getBindServiceExecutor() {
        return zaa;
    }

    @NonNull
    public final i getClientSettings() {
        return this.zab;
    }

    @NonNull
    public pz.d[] getRequiredFeatures() {
        return new pz.d[0];
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.f
    @NonNull
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.EMPTY_SET;
    }

    @NonNull
    public Set<Scope> validateScopes(@NonNull Set<Scope> set) {
        return set;
    }
}
