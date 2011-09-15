
<?php 
// The following content has been XSL transformed from manual.xml using html-pages.xsl
// Please do not edit this content manually
require '../../frame.php';
function printH1() {
    print 'jOOQ classes and their use';
}
function printSlogan() {}
function printContent() {
    global $root;
?>
<p>
<a href="../">Manual</a> : <a href="">jOOQ classes and their use</a>
</p><p>
						In this section, you will learn about how to use jOOQ object
						factories and the jOOQ object oriented query model, to express
						your
						SQL in jOOQ
					</p><h2>Overview</h2><p>jOOQ essentially has two packages:</p><ul>
						
<li>org.jooq: the jOOQ API. Here you will find interfaces for all
							SQL concepts
						</li>
						
<li>org.jooq.impl: the jOOQ implementation and factories. Most
							implementation classes are package private, you can only access
							them using the org.jooq.impl.Factory
						</li>
					
</ul><p>
						This section is about the main jOOQ classes and the global
						architecture. Most of the time, however, you will be using the DSL
						API (DSL for Domain Specific Language) in order to create queries
						the way you're used to in SQL
					</p><ol>
<li>
<a href="<?=$root?>/JOOQ/ExampleDatabase" title="The example database">The example database</a>
</li>
<li>
<a href="<?=$root?>/JOOQ/Factory" title="The factory class">The factory class</a>
</li>
</ol>
<?php 
}
?>

