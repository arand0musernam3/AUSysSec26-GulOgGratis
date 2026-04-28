package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nValueClassUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassUtil.kt\norg/jetbrains/kotlin/serialization/deserialization/ValueClassUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1549#2:47\n1620#2,3:48\n1549#2:51\n1620#2,3:52\n1549#2:55\n1620#2,3:56\n*S KotlinDebug\n*F\n+ 1 ValueClassUtil.kt\norg/jetbrains/kotlin/serialization/deserialization/ValueClassUtilKt\n*L\n25#1:47\n25#1:48,3\n29#1:51\n29#1:52,3\n32#1:55\n32#1:56,3\n*E\n"})
public final class ValueClassUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    @Nullable
    public static final <T extends SimpleTypeMarker> ValueClassRepresentation<T> loadValueClassRepresentation(@NotNull ProtoBuf.Class r52, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull Function1<? super ProtoBuf.Type, ? extends T> function1, @NotNull Function1<? super Name, ? extends T> function12) {
        SimpleTypeMarker simpleTypeMarker;
        ?? multiFieldValueClassUnderlyingTypeList;
        r52.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        function1.getClass();
        function12.getClass();
        if (r52.getMultiFieldValueClassUnderlyingNameCount() <= 0) {
            if (!r52.hasInlineClassUnderlyingPropertyName()) {
                return null;
            }
            Name name = NameResolverUtilKt.getName(nameResolver, r52.getInlineClassUnderlyingPropertyName());
            ProtoBuf.Type typeInlineClassUnderlyingType = ProtoTypeTableUtilKt.inlineClassUnderlyingType(r52, typeTable);
            if ((typeInlineClassUnderlyingType != null && (simpleTypeMarker = (SimpleTypeMarker) function1.invoke(typeInlineClassUnderlyingType)) != null) || (simpleTypeMarker = (SimpleTypeMarker) function12.invoke(name)) != null) {
                return new InlineClassRepresentation(name, simpleTypeMarker);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + NameResolverUtilKt.getName(nameResolver, r52.getFqName()) + " with property " + name).toString());
        }
        List<Integer> multiFieldValueClassUnderlyingNameList = r52.getMultiFieldValueClassUnderlyingNameList();
        multiFieldValueClassUnderlyingNameList.getClass();
        ArrayList arrayList = new ArrayList(e0.o(multiFieldValueClassUnderlyingNameList, 10));
        for (Integer num : multiFieldValueClassUnderlyingNameList) {
            num.getClass();
            arrayList.add(NameResolverUtilKt.getName(nameResolver, num.intValue()));
        }
        Pair pair = new Pair(Integer.valueOf(r52.getMultiFieldValueClassUnderlyingTypeIdCount()), Integer.valueOf(r52.getMultiFieldValueClassUnderlyingTypeCount()));
        if (Intrinsics.areEqual(pair, new Pair(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> multiFieldValueClassUnderlyingTypeIdList = r52.getMultiFieldValueClassUnderlyingTypeIdList();
            multiFieldValueClassUnderlyingTypeIdList.getClass();
            multiFieldValueClassUnderlyingTypeList = new ArrayList(e0.o(multiFieldValueClassUnderlyingTypeIdList, 10));
            for (Integer num2 : multiFieldValueClassUnderlyingTypeIdList) {
                num2.getClass();
                multiFieldValueClassUnderlyingTypeList.add(typeTable.get(num2.intValue()));
            }
        } else {
            if (!Intrinsics.areEqual(pair, new Pair(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + NameResolverUtilKt.getName(nameResolver, r52.getFqName()) + " has illegal multi-field value class representation").toString());
            }
            multiFieldValueClassUnderlyingTypeList = r52.getMultiFieldValueClassUnderlyingTypeList();
        }
        multiFieldValueClassUnderlyingTypeList.getClass();
        ArrayList arrayList2 = new ArrayList(e0.o(multiFieldValueClassUnderlyingTypeList, 10));
        Iterator it = multiFieldValueClassUnderlyingTypeList.iterator();
        while (it.hasNext()) {
            arrayList2.add(function1.invoke(it.next()));
        }
        return new MultiFieldValueClassRepresentation(CollectionsKt.y0(arrayList, arrayList2));
    }
}
