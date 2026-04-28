package uo;

import android.content.SharedPreferences;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import com.app.tgtg.feature.postpurchase.notification.AddReminderFragment;
import f70.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddReminderFragment f41464b;

    public /* synthetic */ a(AddReminderFragment addReminderFragment, int i11) {
        this.f41463a = i11;
        this.f41464b = addReminderFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41463a) {
            case 0:
                n1 n1Var = this.f41464b.f9210g;
                SharedPreferences sharedPreferences = ft.e.f17922c;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
                    sharedPreferences = null;
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean("shouldShowReminderPrompt", false);
                editorEdit.apply();
                qo.h hVar = (qo.h) n1Var.getValue();
                f0.B(m1.d(hVar), null, null, new qo.g(hVar, null, 0), 3);
                qo.h.c((qo.h) n1Var.getValue());
                break;
            case 1:
                n1 n1Var2 = this.f41464b.f9210g;
                SharedPreferences sharedPreferences2 = ft.e.f17922c;
                if (sharedPreferences2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
                    sharedPreferences2 = null;
                }
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                editorEdit2.putBoolean("shouldShowReminderPrompt", false);
                editorEdit2.apply();
                qo.h hVar2 = (qo.h) n1Var2.getValue();
                f0.B(m1.d(hVar2), null, null, new qo.g(hVar2, null, 0), 3);
                qo.h.c((qo.h) n1Var2.getValue());
                break;
            case 2:
                this.f41464b.o().a();
                break;
            case 3:
                this.f41464b.o().f41480c.f39079a.a(k.f17493a);
                break;
            case 4:
                this.f41464b.o().a();
                break;
            default:
                this.f41464b.o().a();
                break;
        }
        return Unit.f26487a;
    }
}
