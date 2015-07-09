---
title: "Eclipse Import & Export"
published: true
morea_id: grade1-orig
morea_type: assessment
morea_outcomes_assessed:
  - outcome-eclipse
morea_sort_order: 1
---

<link rel="stylesheet" href="http://cdn.oesmith.co.uk/morris-0.4.3.min.css">
<script src="//cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
<script src="http://cdn.oesmith.co.uk/morris-0.4.3.min.js"></script>

<div class="well" style="width: 550px">
  <div id="assessment" style="width: 500px; height: 250px"></div>
  Follow the Eclipse project workflow we'll be using for the rest of the semester. "Satisfactory" indicates that working Java code was submitted, but that the Eclipse project was flawed in some way.
</div>

<script>
Morris.Bar({
  element: 'assessment',
  hideHover: false,
  data: [
        { y: 'Excellent (%)', num: 12 },
        { y: 'Satisfactory (%)', num: 12 },
        { y: 'Unsatisfactory (%)', num: 1 },
        ],
  xkey: 'y',
  ykeys: ['num'],
  resize: true,
  labels: ['Students']
});
</script>
