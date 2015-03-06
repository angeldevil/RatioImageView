# RatioImageView
ImageView which scalas one of its axis based on the other axis with the specified ratio.

#Usage
```
<me.angeldevil.ratioimageview.RatioImageView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:background="@color/accent_material_light"
    android:scaleType="centerCrop"
    android:src="@mipmap/ic_launcher"
    app:ratio="0.5"
    app:scala_axis="horizontal"/>
```

 - `scala_axis`: The axis which will be scaled, default is vertical.
 - `ratio`: The scala ratio.

# Licence
Copyright 2015 AngelDevil

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
