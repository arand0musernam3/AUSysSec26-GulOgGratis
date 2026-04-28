package com.adyen.checkout.components.core.internal.util;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.a;
import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.r1;
import androidx.lifecycle.viewmodel.CreationExtras;
import ea.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u0005\u001a\u00020\r\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000bH\u0007¢\u0006\u0004\b\u0005\u0010\u000e\u001a6\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u0000*\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0087\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/l1;", "ViewModelT", "Lkotlin/Function0;", "factoryProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "(Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Lea/f;", "owner", "Landroid/os/Bundle;", "defaultArgs", "Lkotlin/Function1;", "Landroidx/lifecycle/c1;", "Landroidx/lifecycle/a;", "(Lea/f;Landroid/os/Bundle;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/a;", "T", "Landroidx/lifecycle/r1;", "", "key", "Ljava/lang/Class;", "modelClass", "get", "(Landroidx/lifecycle/r1;Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/l1;", "components-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ViewModelExtKt {
    @NotNull
    public static final <T extends l1> T get(@NotNull r1 r1Var, @Nullable String str, @NotNull Class<T> cls) {
        r1Var.getClass();
        cls.getClass();
        return str == null ? (T) r1Var.a(Reflection.getOrCreateKotlinClass(cls)) : (T) r1Var.f3509a.M(str, Reflection.getOrCreateKotlinClass(cls));
    }

    @NotNull
    public static final <ViewModelT extends l1> a viewModelFactory(@NotNull f fVar, @Nullable Bundle bundle, @NotNull final Function1<? super c1, ? extends ViewModelT> function1) {
        fVar.getClass();
        function1.getClass();
        return new a(fVar, bundle) { // from class: com.adyen.checkout.components.core.internal.util.ViewModelExtKt.viewModelFactory.2
            @Override // androidx.lifecycle.a
            @NotNull
            public <T extends l1> T create(@NotNull String key, @NotNull Class<T> modelClass, @NotNull c1 handle) {
                key.getClass();
                modelClass.getClass();
                handle.getClass();
                Object objInvoke = function1.invoke(handle);
                objInvoke.getClass();
                return (T) objInvoke;
            }

            @Override // androidx.lifecycle.ViewModelProvider$Factory
            @NotNull
            public /* bridge */ /* synthetic */ l1 create(@NotNull KClass kClass, @NotNull CreationExtras creationExtras) {
                return super.create(kClass, creationExtras);
            }
        };
    }

    public static final /* synthetic */ <ViewModelT extends l1> ViewModelProvider$Factory viewModelFactory(final Function0<? extends ViewModelT> function0) {
        function0.getClass();
        return new ViewModelProvider$Factory() { // from class: com.adyen.checkout.components.core.internal.util.ViewModelExtKt.viewModelFactory.1
            @Override // androidx.lifecycle.ViewModelProvider$Factory
            @NotNull
            public <T extends l1> T create(@NotNull Class<T> modelClass) {
                modelClass.getClass();
                Object objInvoke = function0.invoke();
                objInvoke.getClass();
                return (T) objInvoke;
            }

            @Override // androidx.lifecycle.ViewModelProvider$Factory
            @NotNull
            public /* bridge */ /* synthetic */ l1 create(@NotNull KClass kClass, @NotNull CreationExtras creationExtras) {
                return super.create(kClass, creationExtras);
            }

            @Override // androidx.lifecycle.ViewModelProvider$Factory
            @NotNull
            public /* bridge */ /* synthetic */ l1 create(@NotNull Class cls, @NotNull CreationExtras creationExtras) {
                return super.create(cls, creationExtras);
            }
        };
    }
}
