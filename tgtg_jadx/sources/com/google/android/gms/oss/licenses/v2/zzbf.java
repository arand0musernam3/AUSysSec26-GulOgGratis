package com.google.android.gms.oss.licenses.v2;

import android.app.Application;
import ba0.g;
import com.google.android.gms.oss.licenses.R;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import o00.o1;
import v80.b0;
import v80.f0;
import x70.c;
import y70.a;
import y80.a2;
import y80.f1;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbf extends i implements Function2 {
    int zza;
    final /* synthetic */ zzbg zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbf(zzbg zzbgVar, c cVar) {
        super(2, cVar);
        this.zzb = zzbgVar;
    }

    @Override // z70.a
    public final c create(Object obj, c cVar) {
        return new zzbf(this.zzb, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbf) create((b0) obj, (c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.COROUTINE_SUSPENDED;
        try {
            if (this.zza != 0) {
                g.M(obj);
            } else {
                g.M(obj);
                Application application = this.zzb.getApplication();
                CoroutineContext coroutineContext = o1.f31726b;
                zzbe zzbeVar = new zzbe(application, null);
                this.zza = 1;
                obj = f0.K(coroutineContext, zzbeVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ArrayList arrayList = (ArrayList) obj;
            f1 f1Var = this.zzb.zza;
            arrayList.getClass();
            zzaz zzazVar = new zzaz(arrayList);
            a2 a2Var = (a2) f1Var;
            a2Var.getClass();
            a2Var.k(null, zzazVar);
        } catch (IOException e5) {
            zzbg zzbgVar = this.zzb;
            f1 f1Var2 = zzbgVar.zza;
            String message = e5.getMessage();
            if (message == null) {
                message = zzbgVar.getApplication().getString(R.string.no_licenses_available);
                message.getClass();
            }
            zzay zzayVar = new zzay(message);
            a2 a2Var2 = (a2) f1Var2;
            a2Var2.getClass();
            a2Var2.k(null, zzayVar);
        }
        return Unit.f26487a;
    }
}
