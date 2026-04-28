package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k90.g;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.collections.e0;
import kotlin.collections.r0;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
final class SignatureEnhancementBuilder {

    @NotNull
    private final Map<String, PredefinedFunctionEnhancementInfo> signatures = new LinkedHashMap();

    @NotNull
    public final Map<String, PredefinedFunctionEnhancementInfo> build() {
        return this.signatures;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public final class ClassEnhancementBuilder {

        @NotNull
        private final String className;
        final /* synthetic */ SignatureEnhancementBuilder this$0;

        public ClassEnhancementBuilder(@NotNull SignatureEnhancementBuilder signatureEnhancementBuilder, String str) {
            str.getClass();
            this.this$0 = signatureEnhancementBuilder;
            this.className = str;
        }

        public final void function(@NotNull String str, @NotNull Function1<? super FunctionEnhancementBuilder, Unit> function1) {
            str.getClass();
            function1.getClass();
            Map map = this.this$0.signatures;
            FunctionEnhancementBuilder functionEnhancementBuilder = new FunctionEnhancementBuilder(this, str);
            function1.invoke(functionEnhancementBuilder);
            Pair<String, PredefinedFunctionEnhancementInfo> pairBuild = functionEnhancementBuilder.build();
            map.put(pairBuild.f26485a, pairBuild.f26486b);
        }

        @NotNull
        public final String getClassName() {
            return this.className;
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @SourceDebugExtension({"SMAP\npredefinedEnhancementInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancementBuilder$ClassEnhancementBuilder$FunctionEnhancementBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,254:1\n1208#2,2:255\n1238#2,4:257\n1208#2,2:261\n1238#2,4:263\n1549#2:267\n1620#2,3:268\n1549#2:271\n1620#2,3:272\n*S KotlinDebug\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancementBuilder$ClassEnhancementBuilder$FunctionEnhancementBuilder\n*L\n226#1:255,2\n226#1:257,4\n237#1:261,2\n237#1:263,4\n245#1:267\n245#1:268,3\n246#1:271\n246#1:272,3\n*E\n"})
        public final class FunctionEnhancementBuilder {

            @NotNull
            private final String functionName;

            @NotNull
            private final List<Pair<String, TypeEnhancementInfo>> parameters;

            @NotNull
            private Pair<String, TypeEnhancementInfo> returnType;
            final /* synthetic */ ClassEnhancementBuilder this$0;

            public FunctionEnhancementBuilder(@NotNull ClassEnhancementBuilder classEnhancementBuilder, String str) {
                str.getClass();
                this.this$0 = classEnhancementBuilder;
                this.functionName = str;
                this.parameters = new ArrayList();
                this.returnType = new Pair<>("V", null);
            }

            @NotNull
            public final Pair<String, PredefinedFunctionEnhancementInfo> build() {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                String className = this.this$0.getClassName();
                String str = this.functionName;
                List<Pair<String, TypeEnhancementInfo>> list = this.parameters;
                ArrayList arrayList = new ArrayList(e0.o(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).f26485a);
                }
                String strSignature = signatureBuildingComponents.signature(className, signatureBuildingComponents.jvmDescriptor(str, arrayList, (String) this.returnType.f26485a));
                TypeEnhancementInfo typeEnhancementInfo = (TypeEnhancementInfo) this.returnType.f26486b;
                List<Pair<String, TypeEnhancementInfo>> list2 = this.parameters;
                ArrayList arrayList2 = new ArrayList(e0.o(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((TypeEnhancementInfo) ((Pair) it2.next()).f26486b);
                }
                return new Pair<>(strSignature, new PredefinedFunctionEnhancementInfo(typeEnhancementInfo, arrayList2));
            }

            public final void parameter(@NotNull String str, @NotNull JavaTypeQualifiers... javaTypeQualifiersArr) {
                TypeEnhancementInfo typeEnhancementInfo;
                str.getClass();
                javaTypeQualifiersArr.getClass();
                List<Pair<String, TypeEnhancementInfo>> list = this.parameters;
                if (javaTypeQualifiersArr.length == 0) {
                    typeEnhancementInfo = null;
                } else {
                    g gVar = new g(new jt.g(javaTypeQualifiersArr, 9), 2);
                    int iA = w0.a(e0.o(gVar, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    Iterator it = gVar.iterator();
                    while (true) {
                        r0 r0Var = (r0) it;
                        if (!r0Var.f26536b.hasNext()) {
                            break;
                        }
                        IndexedValue indexedValue = (IndexedValue) r0Var.next();
                        linkedHashMap.put(Integer.valueOf(indexedValue.f26488a), (JavaTypeQualifiers) indexedValue.f26489b);
                    }
                    typeEnhancementInfo = new TypeEnhancementInfo(linkedHashMap);
                }
                list.add(new Pair<>(str, typeEnhancementInfo));
            }

            public final void returns(@NotNull String str, @NotNull JavaTypeQualifiers... javaTypeQualifiersArr) {
                str.getClass();
                javaTypeQualifiersArr.getClass();
                g gVar = new g(new jt.g(javaTypeQualifiersArr, 9), 2);
                int iA = w0.a(e0.o(gVar, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                Iterator it = gVar.iterator();
                while (true) {
                    r0 r0Var = (r0) it;
                    if (!r0Var.f26536b.hasNext()) {
                        this.returnType = new Pair<>(str, new TypeEnhancementInfo(linkedHashMap));
                        return;
                    } else {
                        IndexedValue indexedValue = (IndexedValue) r0Var.next();
                        linkedHashMap.put(Integer.valueOf(indexedValue.f26488a), (JavaTypeQualifiers) indexedValue.f26489b);
                    }
                }
            }

            public final void returns(@NotNull JvmPrimitiveType jvmPrimitiveType) {
                jvmPrimitiveType.getClass();
                String desc = jvmPrimitiveType.getDesc();
                desc.getClass();
                this.returnType = new Pair<>(desc, null);
            }
        }
    }
}
