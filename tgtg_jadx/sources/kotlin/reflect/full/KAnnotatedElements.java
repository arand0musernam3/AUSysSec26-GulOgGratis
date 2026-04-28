package kotlin.reflect.full;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.k0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b¢\u0006\u0002\u0010\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b\u001a*\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00010\bH\u0007\u001a\u0019\u0010\t\u001a\u00020\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b¨\u0006\u000b"}, d2 = {"findAnnotation", "T", "", "Lkotlin/reflect/KAnnotatedElement;", "(Lkotlin/reflect/KAnnotatedElement;)Ljava/lang/annotation/Annotation;", "findAnnotations", "", "klass", "Lkotlin/reflect/KClass;", "hasAnnotation", "", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKAnnotatedElements.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KAnnotatedElements.kt\nkotlin/reflect/full/KAnnotatedElements\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n20#1:105\n288#2,2:103\n288#2,2:106\n288#2,2:108\n*S KotlinDebug\n*F\n+ 1 KAnnotatedElements.kt\nkotlin/reflect/full/KAnnotatedElements\n*L\n29#1:105\n20#1:103,2\n29#1:106,2\n62#1:108,2\n*E\n"})
public final class KAnnotatedElements {
    public static final /* synthetic */ <T extends Annotation> T findAnnotation(KAnnotatedElement kAnnotatedElement) {
        Object next;
        kAnnotatedElement.getClass();
        Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Annotation annotation = (Annotation) next;
            Intrinsics.reifiedOperationMarker(3, "T");
            if (annotation != null) {
                break;
            }
        }
        Intrinsics.reifiedOperationMarker(1, "T?");
        return (T) next;
    }

    @NotNull
    public static final <T extends Annotation> List<T> findAnnotations(@NotNull KAnnotatedElement kAnnotatedElement, @NotNull KClass<T> kClass) throws IllegalAccessException, InvocationTargetException {
        Object next;
        kAnnotatedElement.getClass();
        kClass.getClass();
        ArrayList arrayListB = k0.B(kAnnotatedElement.getAnnotations(), w.v(kClass));
        if (!arrayListB.isEmpty()) {
            return arrayListB;
        }
        Class<? extends Annotation> clsLoadRepeatableContainer = Java8RepeatableContainerLoader.INSTANCE.loadRepeatableContainer(w.v(kClass));
        if (clsLoadRepeatableContainer != null) {
            Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(w.v(w.u((Annotation) next)), clsLoadRepeatableContainer)) {
                    break;
                }
            }
            Annotation annotation = (Annotation) next;
            if (annotation != null) {
                Object objInvoke = annotation.getClass().getMethod("value", null).invoke(annotation, null);
                objInvoke.getClass();
                List<T> listAsList = Arrays.asList((Annotation[]) objInvoke);
                listAsList.getClass();
                return listAsList;
            }
        }
        return n0.f26529a;
    }

    public static final /* synthetic */ <T extends Annotation> boolean hasAnnotation(KAnnotatedElement kAnnotatedElement) {
        Object next;
        kAnnotatedElement.getClass();
        Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Annotation annotation = (Annotation) next;
            Intrinsics.reifiedOperationMarker(3, "T");
            if (annotation != null) {
                break;
            }
        }
        Intrinsics.reifiedOperationMarker(1, "T?");
        return ((Annotation) next) != null;
    }

    public static final /* synthetic */ <T extends Annotation> List<T> findAnnotations(KAnnotatedElement kAnnotatedElement) {
        kAnnotatedElement.getClass();
        Intrinsics.reifiedOperationMarker(4, "T");
        return findAnnotations(kAnnotatedElement, Reflection.getOrCreateKotlinClass(Annotation.class));
    }
}
