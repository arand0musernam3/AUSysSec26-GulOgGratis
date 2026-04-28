package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\noverridingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 overridingUtils.kt\norg/jetbrains/kotlin/resolve/OverridingUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1620#2,3:85\n847#2,2:88\n*S KotlinDebug\n*F\n+ 1 overridingUtils.kt\norg/jetbrains/kotlin/resolve/OverridingUtilsKt\n*L\n40#1:85,3\n72#1:88,2\n*E\n"})
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <H> Collection<H> selectMostSpecificInEachOverridableGroup(@NotNull Collection<? extends H> collection, @NotNull Function1<? super H, ? extends CallableDescriptor> function1) {
        collection.getClass();
        function1.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet smartSetCreate = SmartSet.Companion.create();
        while (!linkedList.isEmpty()) {
            Object objO = CollectionsKt.O(linkedList);
            final SmartSet smartSetCreate2 = SmartSet.Companion.create();
            Collection collectionExtractMembersOverridableInBothWays = OverridingUtil.extractMembersOverridableInBothWays(objO, linkedList, function1, new Function1<H, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m976invoke(H h11) {
                    SmartSet<H> smartSet = smartSetCreate2;
                    h11.getClass();
                    smartSet.add(h11);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m976invoke(obj);
                    return Unit.f26487a;
                }
            });
            collectionExtractMembersOverridableInBothWays.getClass();
            if (collectionExtractMembersOverridableInBothWays.size() == 1 && smartSetCreate2.isEmpty()) {
                Object objG0 = CollectionsKt.g0(collectionExtractMembersOverridableInBothWays);
                objG0.getClass();
                smartSetCreate.add(objG0);
            } else {
                Object objSelectMostSpecificMember = OverridingUtil.selectMostSpecificMember(collectionExtractMembersOverridableInBothWays, function1);
                objSelectMostSpecificMember.getClass();
                CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(objSelectMostSpecificMember);
                for (Object obj : collectionExtractMembersOverridableInBothWays) {
                    obj.getClass();
                    if (!OverridingUtil.isMoreSpecific(callableDescriptor, (CallableDescriptor) function1.invoke(obj))) {
                        smartSetCreate2.add(obj);
                    }
                }
                if (!smartSetCreate2.isEmpty()) {
                    smartSetCreate.addAll(smartSetCreate2);
                }
                smartSetCreate.add(objSelectMostSpecificMember);
            }
        }
        return smartSetCreate;
    }
}
