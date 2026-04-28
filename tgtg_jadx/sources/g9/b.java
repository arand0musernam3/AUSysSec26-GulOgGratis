package g9;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@s0("activity")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lg9/b;", "Lg9/t0;", "Lg9/a;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActivityNavigator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.android.kt\nandroidx/navigation/ActivityNavigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,504:1\n183#2,2:505\n90#3:507\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.android.kt\nandroidx/navigation/ActivityNavigator\n*L\n46#1:505,2\n96#1:507\n*E\n"})
public class b extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f20103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f20104d;

    public b(Context context) {
        Object next;
        context.getClass();
        this.f20103c = context;
        Iterator it = o80.o.d(context, new g2.q(23)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f20104d = (Activity) next;
    }

    @Override // g9.t0
    public final z a() {
        return new a(this);
    }

    @Override // g9.t0
    public final z c(z zVar, Bundle bundle, i0 i0Var) {
        Intent intent;
        int intExtra;
        a aVar = (a) zVar;
        Intent intent2 = aVar.f20095g;
        l9.h hVar = aVar.f20258b;
        if (intent2 == null) {
            e40.a.g(r8.k.i(hVar.f27563e, " does not have an Intent set.", new StringBuilder("Destination ")));
            return null;
        }
        Intent intent3 = new Intent(aVar.f20095g);
        if (bundle != null) {
            intent3.putExtras(bundle);
            String str = aVar.f20096h;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    if (!bundle.containsKey(strGroup)) {
                        e40.a.l("Could not find ", strGroup, " in ", bundle, " to fill data pattern ", str);
                        return null;
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    j jVar = (j) aVar.h().get(strGroup);
                    q0 q0Var = jVar != null ? jVar.f20149a : null;
                    stringBuffer.append(q0Var != null ? q0Var.f(q0Var.a(bundle, strGroup)) : Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent3.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.f20104d;
        if (activity == null) {
            intent3.addFlags(268435456);
        }
        if (i0Var != null && i0Var.f20138a) {
            intent3.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent3.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent3.putExtra("android-support-navigation:ActivityNavigator:current", hVar.f27563e);
        Context context = this.f20103c;
        Resources resources = context.getResources();
        if (i0Var != null) {
            int i11 = i0Var.f20145h;
            int i12 = i0Var.f20146i;
            if ((i11 <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(i11), "animator")) && (i12 <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(i12), "animator"))) {
                intent3.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i11);
                intent3.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i12).getClass();
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i11) + " and popExit resource " + resources.getResourceName(i12) + " when launching " + aVar);
            }
        }
        context.startActivity(intent3);
        if (i0Var != null && activity != null) {
            int i13 = i0Var.f20143f;
            int i14 = i0Var.f20144g;
            if ((i13 > 0 && Intrinsics.areEqual(resources.getResourceTypeName(i13), "animator")) || (i14 > 0 && Intrinsics.areEqual(resources.getResourceTypeName(i14), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i13) + " and exit resource " + resources.getResourceName(i14) + "when launching " + aVar);
                return null;
            }
            if (i13 >= 0 || i14 >= 0) {
                if (i13 < 0) {
                    i13 = 0;
                }
                activity.overridePendingTransition(i13, i14 >= 0 ? i14 : 0);
            }
        }
        return null;
    }

    @Override // g9.t0
    public final boolean j() {
        Activity activity = this.f20104d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
